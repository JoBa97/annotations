/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spleefleague.annotations;

/**
 *
 * @author balsfull
 */
public abstract class Command {
    
    private final Dispatcher dispatcher;
    
    public Command(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }
    
    private boolean run(CommandSource source, String[] args) {
        return dispatcher.dispatch(this, source, args);
    }
    
    public boolean runPlayer(String[] args) {
        return run(CommandSource.PLAYER, args);
    }
    
    public boolean runConsole(String[] args) {
        return run(CommandSource.CONSOLE, args);
    }
    
    public boolean runCommandBlock(String[] args) {
        return run(CommandSource.COMMAND_BLOCK, args);
    }
}
