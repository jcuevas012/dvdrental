/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.armesoft.util;

import java.security.Key;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author jcq012
 */
public class SimpleKeyGenerator implements KeyGenerator{

    @Override
    public Key generateKey() {
     String keyString = "simplekey";
        Key key = new SecretKeySpec(keyString.getBytes(), 0, keyString.getBytes().length, "DES");
        return key;
    }
    
}
