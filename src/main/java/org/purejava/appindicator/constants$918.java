// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$918 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$918() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(g_dbus_object_manager_client_new_sync$get_proxy_type_func.class, "apply", constants$332.const$2);
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(g_dbus_object_manager_client_new_sync$get_proxy_type_destroy_notify.class, "apply", constants$13.const$1);
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_dbus_object_manager_client_new_sync",
        constants$918.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(g_dbus_object_manager_client_new_for_bus$get_proxy_type_func.class, "apply", constants$332.const$2);
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(g_dbus_object_manager_client_new_for_bus$get_proxy_type_destroy_notify.class, "apply", constants$13.const$1);
}

