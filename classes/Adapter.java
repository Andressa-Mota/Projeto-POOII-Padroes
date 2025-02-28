package classes;

public class Adapter {
    

    private ExportData exportData;

    public Adapter() {
        this.exportData = new ExportData();
    }

    public String exportarDadosEstudanteJSON() {
     
        String xmlData = Main.exportarDadosEstudante();
        
       
        String jsonData = convertXmlToJson(xmlData);
        
        return jsonData;
    }

    private String convertXmlToJson(String xml) {
        
        xml = xml.replace("<?xml version=\"1.0\"?>", "").trim();
        
       
        xml = xml.replace("<data>", "{ \"data\": {");
        xml = xml.replace("</data>", "} }");
        xml = xml.replace("<student>", "{ \"student\": {");
        xml = xml.replace("</student>", "} }");

       
        xml = xml.replaceAll("<(\\w+)>(.*?)</\\1>", "\"$1\": \"$2\"");

        return xml;
    }
}

