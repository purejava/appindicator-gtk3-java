// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1685 {

    static final FunctionDescriptor gtk_aspect_frame_set$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_aspect_frame_set$MH = RuntimeHelper.downcallHandle(
        "gtk_aspect_frame_set",
        constants$1685.gtk_aspect_frame_set$FUNC
    );
    static final FunctionDescriptor GtkAssistantPageFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkAssistantPageFunc$MH = RuntimeHelper.downcallHandle(
        constants$1685.GtkAssistantPageFunc$FUNC
    );
    static final FunctionDescriptor gtk_assistant_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_assistant_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_assistant_get_type",
        constants$1685.gtk_assistant_get_type$FUNC
    );
    static final FunctionDescriptor gtk_assistant_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_assistant_new$MH = RuntimeHelper.downcallHandle(
        "gtk_assistant_new",
        constants$1685.gtk_assistant_new$FUNC
    );
    static final FunctionDescriptor gtk_assistant_next_page$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_assistant_next_page$MH = RuntimeHelper.downcallHandle(
        "gtk_assistant_next_page",
        constants$1685.gtk_assistant_next_page$FUNC
    );
}


