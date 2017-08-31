/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spleefleague.annotations;

import com.spleefleague.annotations.Command;
import com.spleefleague.annotations.CommandSource;

/**
 *
 * @author balsfull
 */
public interface Dispatcher {
    public boolean dispatch(Command instance, CommandSource source, String[] args);
}
