package edu.bsuir.rpcclient;

// классы, чтобы пропарсить xml-ку c wsdl описанием
// и дотянуться до тега service в нем
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
// такой эксепшн возникнет при работе с объектом URL
import java.net.MalformedURLException;
// нужно, чтобы получить wsdl описание и через него
// дотянуться до самого веб-сервиса
import java.net.URL;



public class MusikStoreWebServiceClient {

    public static void main(String[] args) throws MalformedURLException {
        // создаем ссылку на wsdl описание
        URL url = new URL("http://localhost:1986/rpcserver/musikstore?wsdl");
        // Параметры следующего конструктора смотрим в самом первом теге WSDL описания - definitions
        // 1-ый аргумент смотрим в атрибуте targetNamespace
        // 2-ой аргумент смотрим в атрибуте name
        QName qname = new QName("http://rpcserver.bsuir.edu/", "MusikStoreWebServiceImplService");
        // Теперь мы можем дотянуться до тега service в wsdl описании,
        Service service = Service.create(url, qname);
        // а далее и до вложенного в него тега port, чтобы
        // получить ссылку на удаленный от нас объект веб-сервиса
        QName qport = new QName("http://rpcserver.bsuir.edu/","MusikStoreWebServiceImplPort");
        MusikStoreWebService musikStoreWebService = service.getPort(qport,MusikStoreWebService.class);
        //Теперь можно вызывать удаленный метод
        System.out.println(musikStoreWebService.getSongsTitle("Basta"));
    }
}
