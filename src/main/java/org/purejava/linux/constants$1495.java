// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1495 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1495() {}
    static final FunctionDescriptor gtk_assistant_next_page$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_assistant_next_page$MH = RuntimeHelper.downcallHandle(
        "gtk_assistant_next_page",
        constants$1495.gtk_assistant_next_page$FUNC
    );
    static final FunctionDescriptor gtk_assistant_previous_page$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_assistant_previous_page$MH = RuntimeHelper.downcallHandle(
        "gtk_assistant_previous_page",
        constants$1495.gtk_assistant_previous_page$FUNC
    );
    static final FunctionDescriptor gtk_assistant_get_current_page$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_assistant_get_current_page$MH = RuntimeHelper.downcallHandle(
        "gtk_assistant_get_current_page",
        constants$1495.gtk_assistant_get_current_page$FUNC
    );
    static final FunctionDescriptor gtk_assistant_set_current_page$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_assistant_set_current_page$MH = RuntimeHelper.downcallHandle(
        "gtk_assistant_set_current_page",
        constants$1495.gtk_assistant_set_current_page$FUNC
    );
    static final FunctionDescriptor gtk_assistant_get_n_pages$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_assistant_get_n_pages$MH = RuntimeHelper.downcallHandle(
        "gtk_assistant_get_n_pages",
        constants$1495.gtk_assistant_get_n_pages$FUNC
    );
    static final FunctionDescriptor gtk_assistant_get_nth_page$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_assistant_get_nth_page$MH = RuntimeHelper.downcallHandle(
        "gtk_assistant_get_nth_page",
        constants$1495.gtk_assistant_get_nth_page$FUNC
    );
}


