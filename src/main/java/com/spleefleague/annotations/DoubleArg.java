/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spleefleague.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author balsfull
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.PARAMETER})
@Argument(target = double.class)
public @interface DoubleArg {
    double min() default Double.MIN_VALUE;
    double max() default Double.MAX_VALUE;
    boolean allowNaN() default false;
    boolean allowInfinity() default false;
}
