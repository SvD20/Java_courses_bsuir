package edu.bsuir;

import java.rmi.RemoteException;
import java.util.Arrays;

public class StringProcessingImpl implements StringProcessing{

    @Override
    public String vowelSubstitution(String startString) throws RemoteException {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] startArray = startString.toCharArray();
        for (int i = 0; i < startArray.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (startArray[i] == vowels[j]) {
                    startArray[i] = '*';
                }
            }
        }
        return Arrays.toString(startArray);
    }


}
