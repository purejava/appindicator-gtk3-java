// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$183 {

    static final  GroupLayout g_unix_fd_source_funcs$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("prepare"),
        Constants$root.C_POINTER$LAYOUT.withName("check"),
        Constants$root.C_POINTER$LAYOUT.withName("dispatch"),
        Constants$root.C_POINTER$LAYOUT.withName("finalize"),
        Constants$root.C_POINTER$LAYOUT.withName("closure_callback"),
        Constants$root.C_POINTER$LAYOUT.withName("closure_marshal")
    ).withName("_GSourceFuncs");
    static final MemorySegment g_unix_fd_source_funcs$SEGMENT = RuntimeHelper.lookupGlobalVariable("g_unix_fd_source_funcs", constants$183.g_unix_fd_source_funcs$LAYOUT);
    static final FunctionDescriptor g_unicode_script_to_iso15924$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_unicode_script_to_iso15924$MH = RuntimeHelper.downcallHandle(
        "g_unicode_script_to_iso15924",
        constants$183.g_unicode_script_to_iso15924$FUNC
    );
    static final FunctionDescriptor g_unicode_script_from_iso15924$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_unicode_script_from_iso15924$MH = RuntimeHelper.downcallHandle(
        "g_unicode_script_from_iso15924",
        constants$183.g_unicode_script_from_iso15924$FUNC
    );
    static final FunctionDescriptor g_unichar_isalnum$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_unichar_isalnum$MH = RuntimeHelper.downcallHandle(
        "g_unichar_isalnum",
        constants$183.g_unichar_isalnum$FUNC
    );
    static final FunctionDescriptor g_unichar_isalpha$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_unichar_isalpha$MH = RuntimeHelper.downcallHandle(
        "g_unichar_isalpha",
        constants$183.g_unichar_isalpha$FUNC
    );
    static final FunctionDescriptor g_unichar_iscntrl$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_unichar_iscntrl$MH = RuntimeHelper.downcallHandle(
        "g_unichar_iscntrl",
        constants$183.g_unichar_iscntrl$FUNC
    );
}


