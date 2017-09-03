/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spleefleague.annotations;

import java.util.Optional;

/**
 *
 * @author jonas
 */
public class DispatchResult {
    
    private final String message;
    private final DispatchResultType type;
    
    public DispatchResult(String message, DispatchResultType type) {
        this.message = message;
        this.type = type;
    }
    
    public DispatchResult(DispatchResultType type) {
        this(null, type);
    }

    public Optional<String> getMessage() {
        return Optional.ofNullable(message);
    }

    public DispatchResultType getType() {
        return type;
    }
}
