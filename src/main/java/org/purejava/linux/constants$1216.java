// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1216 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1216() {}
    static final FunctionDescriptor atk_text_get_text_before_offset$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_text_get_text_before_offset$MH = RuntimeHelper.downcallHandle(
        "atk_text_get_text_before_offset",
        constants$1216.atk_text_get_text_before_offset$FUNC
    );
    static final FunctionDescriptor atk_text_get_string_at_offset$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_text_get_string_at_offset$MH = RuntimeHelper.downcallHandle(
        "atk_text_get_string_at_offset",
        constants$1216.atk_text_get_string_at_offset$FUNC
    );
    static final FunctionDescriptor atk_text_get_caret_offset$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_text_get_caret_offset$MH = RuntimeHelper.downcallHandle(
        "atk_text_get_caret_offset",
        constants$1216.atk_text_get_caret_offset$FUNC
    );
    static final FunctionDescriptor atk_text_get_character_extents$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_text_get_character_extents$MH = RuntimeHelper.downcallHandle(
        "atk_text_get_character_extents",
        constants$1216.atk_text_get_character_extents$FUNC
    );
    static final FunctionDescriptor atk_text_get_run_attributes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_text_get_run_attributes$MH = RuntimeHelper.downcallHandle(
        "atk_text_get_run_attributes",
        constants$1216.atk_text_get_run_attributes$FUNC
    );
    static final FunctionDescriptor atk_text_get_default_attributes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_text_get_default_attributes$MH = RuntimeHelper.downcallHandle(
        "atk_text_get_default_attributes",
        constants$1216.atk_text_get_default_attributes$FUNC
    );
}


