// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1838 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1838() {}
    static final FunctionDescriptor gtk_text_buffer_unregister_serialize_format$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_unregister_serialize_format$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_unregister_serialize_format",
        constants$1838.gtk_text_buffer_unregister_serialize_format$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_unregister_deserialize_format$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_unregister_deserialize_format$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_unregister_deserialize_format",
        constants$1838.gtk_text_buffer_unregister_deserialize_format$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_deserialize_set_can_create_tags$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_deserialize_set_can_create_tags$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_deserialize_set_can_create_tags",
        constants$1838.gtk_text_buffer_deserialize_set_can_create_tags$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_deserialize_get_can_create_tags$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_deserialize_get_can_create_tags$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_deserialize_get_can_create_tags",
        constants$1838.gtk_text_buffer_deserialize_get_can_create_tags$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_get_serialize_formats$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_get_serialize_formats$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_get_serialize_formats",
        constants$1838.gtk_text_buffer_get_serialize_formats$FUNC
    );
    static final FunctionDescriptor gtk_text_buffer_get_deserialize_formats$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_text_buffer_get_deserialize_formats$MH = RuntimeHelper.downcallHandle(
        "gtk_text_buffer_get_deserialize_formats",
        constants$1838.gtk_text_buffer_get_deserialize_formats$FUNC
    );
}


