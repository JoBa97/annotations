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
public enum CommandSource {
    PLAYER,
    COMMAND_BLOCK,
    CONSOLE;
    
    public static CommandSource[] ALL = {PLAYER, CONSOLE};
}
