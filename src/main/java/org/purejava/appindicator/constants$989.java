// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$989 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$989() {}
    static final FunctionDescriptor feof$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle feof$MH = RuntimeHelper.downcallHandle(
        "feof",
        constants$989.feof$FUNC
    );
    static final FunctionDescriptor ferror$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ferror$MH = RuntimeHelper.downcallHandle(
        "ferror",
        constants$989.ferror$FUNC
    );
    static final FunctionDescriptor clearerr_unlocked$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle clearerr_unlocked$MH = RuntimeHelper.downcallHandle(
        "clearerr_unlocked",
        constants$989.clearerr_unlocked$FUNC
    );
    static final FunctionDescriptor feof_unlocked$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle feof_unlocked$MH = RuntimeHelper.downcallHandle(
        "feof_unlocked",
        constants$989.feof_unlocked$FUNC
    );
    static final FunctionDescriptor ferror_unlocked$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ferror_unlocked$MH = RuntimeHelper.downcallHandle(
        "ferror_unlocked",
        constants$989.ferror_unlocked$FUNC
    );
    static final FunctionDescriptor perror$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle perror$MH = RuntimeHelper.downcallHandle(
        "perror",
        constants$989.perror$FUNC
    );
}


