// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$182 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$182() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_dataset_destroy",
        constants$13.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_dataset_id_get_data",
        constants$21.const$3
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_datalist_get_data",
        constants$5.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(g_dataset_id_set_data_full$destroy_func.class, "apply", constants$13.const$1);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_dataset_id_set_data_full",
        constants$179.const$1
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_dataset_id_remove_no_notify",
        constants$21.const$3
    );
}


