package edu.bsuir.rpcserver;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService// говорим, что наш интерфейс будет работать как веб-сервис
@SOAPBinding(style = SOAPBinding.Style.RPC)// говорим, что веб-сервис будет использоваться для вызова методов
public interface MusikStoreWebService {
    // говорим, что этот метод можно вызывать удаленно
    @WebMethod
    public String getSongsTitle(String artistname);
}
