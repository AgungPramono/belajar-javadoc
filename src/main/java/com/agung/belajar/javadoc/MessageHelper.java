package com.agung.belajar.javadoc;

import org.apache.commons.lang3.StringUtils;

public class MessageHelper {

    public static String ubahKehurufKapital(String value){
        if(value != null){
              return StringUtils.capitalize(value);
        }
        return value;
    }


    /**
	*	
	* hitung panjang karakter
	* @param value kalimat yg akan diproses
	* @param panjang panjang yg akan diproses
	* @return panjang karakter
	*/
    public static Integer hitungPanjangKarakter(String value, Integer panjang){
        return StringUtils.length(value);
    }

    public static Boolean isEmtpy(String value){
        return StringUtils.isNoneEmpty(value);
    }

}
