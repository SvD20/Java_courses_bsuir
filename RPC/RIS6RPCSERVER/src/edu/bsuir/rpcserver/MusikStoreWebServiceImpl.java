package edu.bsuir.rpcserver;

import javax.jws.WebService;


@WebService(endpointInterface = "edu.bsuir.rpcserver.MusikStoreWebService")
public class MusikStoreWebServiceImpl implements MusikStoreWebService{

    private String artist = "Basta";
    private String song = "Moya igra";

    @Override
    public String getSongsTitle(String artistname) {
        if(artistname.equalsIgnoreCase(artist)){
            return song;
        }
        else {
            return "none";
        }
    }
}
