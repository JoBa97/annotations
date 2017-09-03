/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spleefleague.annotations;

import org.bukkit.command.CommandSender;

/**
 *
 * @author balsfull
 */
public interface Dispatcher {
    public DispatchResult dispatch(DispatchableCommand instance, CommandSender sender, CommandSource source, String[] args);
}
