// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1979 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1979() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "atk_object_set_name",
        constants$13.const$4
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "atk_object_set_description",
        constants$13.const$4
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "atk_object_set_parent",
        constants$13.const$4
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "atk_object_set_role",
        constants$40.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(atk_object_connect_property_change_handler$handler.class, "apply", constants$13.const$4);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "atk_object_connect_property_change_handler",
        constants$9.const$0
    );
}

