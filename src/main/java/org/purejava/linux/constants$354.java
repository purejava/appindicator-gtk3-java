// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$354 {

    static final FunctionDescriptor pthread_attr_getinheritsched$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_attr_getinheritsched$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_getinheritsched",
        constants$354.pthread_attr_getinheritsched$FUNC
    );
    static final FunctionDescriptor pthread_attr_setinheritsched$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pthread_attr_setinheritsched$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_setinheritsched",
        constants$354.pthread_attr_setinheritsched$FUNC
    );
    static final FunctionDescriptor pthread_attr_getscope$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_attr_getscope$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_getscope",
        constants$354.pthread_attr_getscope$FUNC
    );
    static final FunctionDescriptor pthread_attr_setscope$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pthread_attr_setscope$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_setscope",
        constants$354.pthread_attr_setscope$FUNC
    );
    static final FunctionDescriptor pthread_attr_getstackaddr$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_attr_getstackaddr$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_getstackaddr",
        constants$354.pthread_attr_getstackaddr$FUNC
    );
    static final FunctionDescriptor pthread_attr_setstackaddr$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_attr_setstackaddr$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_setstackaddr",
        constants$354.pthread_attr_setstackaddr$FUNC
    );
}


