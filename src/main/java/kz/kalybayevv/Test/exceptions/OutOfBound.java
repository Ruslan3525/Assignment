package kz.kalybayevv.Test.exceptions;

import lombok.experimental.StandardException;

@StandardException
public class OutOfBound extends Exception {
    public OutOfBound(String error) {
        super(error);
    }
}
