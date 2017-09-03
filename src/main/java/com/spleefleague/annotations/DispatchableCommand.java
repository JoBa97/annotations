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
public abstract class DispatchableCommand {
    
    private final Dispatcher dispatcher;
    
    public DispatchableCommand(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }
    
    public DispatchResult run(CommandSender sender, CommandSource source, String[] args) {
        return dispatcher.dispatch(this, sender, source, args);
    }
    
    public DispatchResult runPlayer(CommandSender sender, String[] args) {
        return run(sender, CommandSource.PLAYER, args);
    }
    
    public DispatchResult runConsole(CommandSender sender, String[] args) {
        return run(sender, CommandSource.CONSOLE, args);
    }
    
    public DispatchResult runCommandBlock(CommandSender sender, String[] args) {
        return run(sender, CommandSource.COMMAND_BLOCK, args);
    }
}
