// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1803 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1803() {}
    static final VarHandle const$0 = constants$1802.const$3.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    static final VarHandle const$1 = constants$1802.const$3.varHandle(MemoryLayout.PathElement.groupElement("time"));
    static final VarHandle const$2 = constants$1802.const$3.varHandle(MemoryLayout.PathElement.groupElement("group"));
    static final VarHandle const$3 = constants$1802.const$3.varHandle(MemoryLayout.PathElement.groupElement("mode"));
    static final UnionLayout const$4 = MemoryLayout.unionLayout(
        JAVA_INT.withName("type"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("type"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("window"),
            JAVA_BYTE.withName("send_event"),
            MemoryLayout.paddingLayout(7)
        ).withName("any"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("type"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("window"),
            JAVA_BYTE.withName("send_event"),
            MemoryLayout.paddingLayout(3),
            MemoryLayout.structLayout(
                JAVA_INT.withName("x"),
                JAVA_INT.withName("y"),
                JAVA_INT.withName("width"),
                JAVA_INT.withName("height")
            ).withName("area"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("region"),
            JAVA_INT.withName("count"),
            MemoryLayout.paddingLayout(4)
        ).withName("expose"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("type"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("window"),
            JAVA_BYTE.withName("send_event"),
            MemoryLayout.paddingLayout(3),
            JAVA_INT.withName("state")
        ).withName("visibility"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("type"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("window"),
            JAVA_BYTE.withName("send_event"),
            MemoryLayout.paddingLayout(3),
            JAVA_INT.withName("time"),
            JAVA_DOUBLE.withName("x"),
            JAVA_DOUBLE.withName("y"),
            RuntimeHelper.POINTER.withName("axes"),
            JAVA_INT.withName("state"),
            JAVA_SHORT.withName("is_hint"),
            MemoryLayout.paddingLayout(2),
            RuntimeHelper.POINTER.withName("device"),
            JAVA_DOUBLE.withName("x_root"),
            JAVA_DOUBLE.withName("y_root")
        ).withName("motion"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("type"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("window"),
            JAVA_BYTE.withName("send_event"),
            MemoryLayout.paddingLayout(3),
            JAVA_INT.withName("time"),
            JAVA_DOUBLE.withName("x"),
            JAVA_DOUBLE.withName("y"),
            RuntimeHelper.POINTER.withName("axes"),
            JAVA_INT.withName("state"),
            JAVA_INT.withName("button"),
            RuntimeHelper.POINTER.withName("device"),
            JAVA_DOUBLE.withName("x_root"),
            JAVA_DOUBLE.withName("y_root")
        ).withName("button"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("type"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("window"),
            JAVA_BYTE.withName("send_event"),
            MemoryLayout.paddingLayout(3),
            JAVA_INT.withName("time"),
            JAVA_DOUBLE.withName("x"),
            JAVA_DOUBLE.withName("y"),
            RuntimeHelper.POINTER.withName("axes"),
            JAVA_INT.withName("state"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("sequence"),
            JAVA_INT.withName("emulating_pointer"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("device"),
            JAVA_DOUBLE.withName("x_root"),
            JAVA_DOUBLE.withName("y_root")
        ).withName("touch"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("type"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("window"),
            JAVA_BYTE.withName("send_event"),
            MemoryLayout.paddingLayout(3),
            JAVA_INT.withName("time"),
            JAVA_DOUBLE.withName("x"),
            JAVA_DOUBLE.withName("y"),
            JAVA_INT.withName("state"),
            JAVA_INT.withName("direction"),
            RuntimeHelper.POINTER.withName("device"),
            JAVA_DOUBLE.withName("x_root"),
            JAVA_DOUBLE.withName("y_root"),
            JAVA_DOUBLE.withName("delta_x"),
            JAVA_DOUBLE.withName("delta_y"),
            MemoryLayout.paddingLayout(8)
        ).withName("scroll"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("type"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("window"),
            JAVA_BYTE.withName("send_event"),
            MemoryLayout.paddingLayout(3),
            JAVA_INT.withName("time"),
            JAVA_INT.withName("state"),
            JAVA_INT.withName("keyval"),
            JAVA_INT.withName("length"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("string"),
            JAVA_SHORT.withName("hardware_keycode"),
            JAVA_BYTE.withName("group"),
            MemoryLayout.paddingLayout(5)
        ).withName("key"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("type"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("window"),
            JAVA_BYTE.withName("send_event"),
            MemoryLayout.paddingLayout(7),
            RuntimeHelper.POINTER.withName("subwindow"),
            JAVA_INT.withName("time"),
            MemoryLayout.paddingLayout(4),
            JAVA_DOUBLE.withName("x"),
            JAVA_DOUBLE.withName("y"),
            JAVA_DOUBLE.withName("x_root"),
            JAVA_DOUBLE.withName("y_root"),
            JAVA_INT.withName("mode"),
            JAVA_INT.withName("detail"),
            JAVA_INT.withName("focus"),
            JAVA_INT.withName("state")
        ).withName("crossing"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("type"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("window"),
            JAVA_BYTE.withName("send_event"),
            MemoryLayout.paddingLayout(1),
            JAVA_SHORT.withName("in"),
            MemoryLayout.paddingLayout(4)
        ).withName("focus_change"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("type"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("window"),
            JAVA_BYTE.withName("send_event"),
            MemoryLayout.paddingLayout(3),
            JAVA_INT.withName("x"),
            JAVA_INT.withName("y"),
            JAVA_INT.withName("width"),
            JAVA_INT.withName("height"),
            MemoryLayout.paddingLayout(4)
        ).withName("configure"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("type"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("window"),
            JAVA_BYTE.withName("send_event"),
            MemoryLayout.paddingLayout(7),
            RuntimeHelper.POINTER.withName("atom"),
            JAVA_INT.withName("time"),
            JAVA_INT.withName("state")
        ).withName("property"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("type"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("window"),
            JAVA_BYTE.withName("send_event"),
            MemoryLayout.paddingLayout(7),
            RuntimeHelper.POINTER.withName("selection"),
            RuntimeHelper.POINTER.withName("target"),
            RuntimeHelper.POINTER.withName("property"),
            JAVA_INT.withName("time"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("requestor")
        ).withName("selection"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("type"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("window"),
            JAVA_BYTE.withName("send_event"),
            MemoryLayout.paddingLayout(7),
            RuntimeHelper.POINTER.withName("owner"),
            JAVA_INT.withName("reason"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("selection"),
            JAVA_INT.withName("time"),
            JAVA_INT.withName("selection_time")
        ).withName("owner_change"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("type"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("window"),
            JAVA_BYTE.withName("send_event"),
            MemoryLayout.paddingLayout(3),
            JAVA_INT.withName("time"),
            RuntimeHelper.POINTER.withName("device")
        ).withName("proximity"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("type"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("window"),
            JAVA_BYTE.withName("send_event"),
            MemoryLayout.paddingLayout(7),
            RuntimeHelper.POINTER.withName("context"),
            JAVA_INT.withName("time"),
            JAVA_SHORT.withName("x_root"),
            JAVA_SHORT.withName("y_root")
        ).withName("dnd"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("type"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("window"),
            JAVA_BYTE.withName("send_event"),
            MemoryLayout.paddingLayout(3),
            JAVA_INT.withName("changed_mask"),
            JAVA_INT.withName("new_window_state"),
            MemoryLayout.paddingLayout(4)
        ).withName("window_state"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("type"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("window"),
            JAVA_BYTE.withName("send_event"),
            MemoryLayout.paddingLayout(3),
            JAVA_INT.withName("action"),
            RuntimeHelper.POINTER.withName("name")
        ).withName("setting"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("type"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("window"),
            JAVA_BYTE.withName("send_event"),
            MemoryLayout.paddingLayout(3),
            JAVA_INT.withName("keyboard"),
            JAVA_INT.withName("implicit"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("grab_window")
        ).withName("grab_broken"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("type"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("window"),
            JAVA_BYTE.withName("send_event"),
            JAVA_BYTE.withName("phase"),
            JAVA_BYTE.withName("n_fingers"),
            MemoryLayout.paddingLayout(1),
            JAVA_INT.withName("time"),
            JAVA_DOUBLE.withName("x"),
            JAVA_DOUBLE.withName("y"),
            JAVA_DOUBLE.withName("dx"),
            JAVA_DOUBLE.withName("dy"),
            JAVA_DOUBLE.withName("x_root"),
            JAVA_DOUBLE.withName("y_root"),
            JAVA_INT.withName("state"),
            MemoryLayout.paddingLayout(4)
        ).withName("touchpad_swipe"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("type"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("window"),
            JAVA_BYTE.withName("send_event"),
            JAVA_BYTE.withName("phase"),
            JAVA_BYTE.withName("n_fingers"),
            MemoryLayout.paddingLayout(1),
            JAVA_INT.withName("time"),
            JAVA_DOUBLE.withName("x"),
            JAVA_DOUBLE.withName("y"),
            JAVA_DOUBLE.withName("dx"),
            JAVA_DOUBLE.withName("dy"),
            JAVA_DOUBLE.withName("angle_delta"),
            JAVA_DOUBLE.withName("scale"),
            JAVA_DOUBLE.withName("x_root"),
            JAVA_DOUBLE.withName("y_root"),
            JAVA_INT.withName("state"),
            MemoryLayout.paddingLayout(4)
        ).withName("touchpad_pinch"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("type"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("window"),
            JAVA_BYTE.withName("send_event"),
            MemoryLayout.paddingLayout(3),
            JAVA_INT.withName("time"),
            JAVA_INT.withName("group"),
            JAVA_INT.withName("button"),
            JAVA_INT.withName("mode"),
            MemoryLayout.paddingLayout(4)
        ).withName("pad_button"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("type"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("window"),
            JAVA_BYTE.withName("send_event"),
            MemoryLayout.paddingLayout(3),
            JAVA_INT.withName("time"),
            JAVA_INT.withName("group"),
            JAVA_INT.withName("index"),
            JAVA_INT.withName("mode"),
            MemoryLayout.paddingLayout(4),
            JAVA_DOUBLE.withName("value")
        ).withName("pad_axis"),
        MemoryLayout.structLayout(
            JAVA_INT.withName("type"),
            MemoryLayout.paddingLayout(4),
            RuntimeHelper.POINTER.withName("window"),
            JAVA_BYTE.withName("send_event"),
            MemoryLayout.paddingLayout(3),
            JAVA_INT.withName("time"),
            JAVA_INT.withName("group"),
            JAVA_INT.withName("mode")
        ).withName("pad_group_mode")
    ).withName("_GdkEvent");
    static final VarHandle const$5 = constants$1803.const$4.varHandle(MemoryLayout.PathElement.groupElement("type"));
}


