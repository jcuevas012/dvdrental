/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.armesoft.filtres;

import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;
import javax.ws.rs.NameBinding;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

/**
 *
 * @author jcq012
 */
@NameBinding
@Retention(RUNTIME)
@Target({TYPE, METHOD})
public @interface JWTNeeded {
}
