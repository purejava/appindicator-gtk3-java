// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1085 {

    static final FunctionDescriptor pango_attr_iterator_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle pango_attr_iterator_get_type$MH = RuntimeHelper.downcallHandle(
        "pango_attr_iterator_get_type",
        constants$1085.pango_attr_iterator_get_type$FUNC
    );
    static final FunctionDescriptor pango_attr_list_get_iterator$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_attr_list_get_iterator$MH = RuntimeHelper.downcallHandle(
        "pango_attr_list_get_iterator",
        constants$1085.pango_attr_list_get_iterator$FUNC
    );
    static final FunctionDescriptor pango_attr_iterator_range$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_attr_iterator_range$MH = RuntimeHelper.downcallHandle(
        "pango_attr_iterator_range",
        constants$1085.pango_attr_iterator_range$FUNC
    );
    static final FunctionDescriptor pango_attr_iterator_next$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_attr_iterator_next$MH = RuntimeHelper.downcallHandle(
        "pango_attr_iterator_next",
        constants$1085.pango_attr_iterator_next$FUNC
    );
    static final FunctionDescriptor pango_attr_iterator_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_attr_iterator_copy$MH = RuntimeHelper.downcallHandle(
        "pango_attr_iterator_copy",
        constants$1085.pango_attr_iterator_copy$FUNC
    );
    static final FunctionDescriptor pango_attr_iterator_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_attr_iterator_destroy$MH = RuntimeHelper.downcallHandle(
        "pango_attr_iterator_destroy",
        constants$1085.pango_attr_iterator_destroy$FUNC
    );
}


