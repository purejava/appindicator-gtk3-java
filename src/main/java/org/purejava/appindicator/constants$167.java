// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$167 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$167() {}
    static final FunctionDescriptor GSourceOnceFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GSourceOnceFunc_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GSourceOnceFunc_UP$MH = RuntimeHelper.upcallHandle(GSourceOnceFunc.class, "apply", constants$167.GSourceOnceFunc_UP$FUNC);
    static final FunctionDescriptor GSourceOnceFunc_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GSourceOnceFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$167.GSourceOnceFunc_DOWN$FUNC
    );
    static final FunctionDescriptor GChildWatchFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GChildWatchFunc_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GChildWatchFunc_UP$MH = RuntimeHelper.upcallHandle(GChildWatchFunc.class, "apply", constants$167.GChildWatchFunc_UP$FUNC);
    static final FunctionDescriptor GChildWatchFunc_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GChildWatchFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$167.GChildWatchFunc_DOWN$FUNC
    );
    static final FunctionDescriptor GSourceDisposeFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GSourceDisposeFunc_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GSourceDisposeFunc_UP$MH = RuntimeHelper.upcallHandle(GSourceDisposeFunc.class, "apply", constants$167.GSourceDisposeFunc_UP$FUNC);
    static final FunctionDescriptor GSourceDisposeFunc_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GSourceDisposeFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$167.GSourceDisposeFunc_DOWN$FUNC
    );
}

