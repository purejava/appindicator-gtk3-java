// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1074 {

    static final FunctionDescriptor pango_attribute_init$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_attribute_init$MH = RuntimeHelper.downcallHandle(
        "pango_attribute_init",
        constants$1074.pango_attribute_init$FUNC
    );
    static final FunctionDescriptor pango_attribute_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_attribute_copy$MH = RuntimeHelper.downcallHandle(
        "pango_attribute_copy",
        constants$1074.pango_attribute_copy$FUNC
    );
    static final FunctionDescriptor pango_attribute_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_attribute_destroy$MH = RuntimeHelper.downcallHandle(
        "pango_attribute_destroy",
        constants$1074.pango_attribute_destroy$FUNC
    );
    static final FunctionDescriptor pango_attribute_equal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_attribute_equal$MH = RuntimeHelper.downcallHandle(
        "pango_attribute_equal",
        constants$1074.pango_attribute_equal$FUNC
    );
    static final FunctionDescriptor pango_attr_language_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_attr_language_new$MH = RuntimeHelper.downcallHandle(
        "pango_attr_language_new",
        constants$1074.pango_attr_language_new$FUNC
    );
    static final FunctionDescriptor pango_attr_family_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_attr_family_new$MH = RuntimeHelper.downcallHandle(
        "pango_attr_family_new",
        constants$1074.pango_attr_family_new$FUNC
    );
}

