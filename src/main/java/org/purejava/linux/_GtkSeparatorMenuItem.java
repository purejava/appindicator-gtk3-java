// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkSeparatorMenuItem {
 *     GtkMenuItem menu_item;
 * };
 * }
 */
public class _GtkSeparatorMenuItem {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.structLayout(
                        MemoryLayout.structLayout(
                            MemoryLayout.structLayout(
                                Constants$root.C_POINTER$LAYOUT.withName("g_class")
                            ).withName("g_type_instance"),
                            Constants$root.C_INT$LAYOUT.withName("ref_count"),
                            MemoryLayout.paddingLayout(32),
                            Constants$root.C_POINTER$LAYOUT.withName("qdata")
                        ).withName("parent_instance"),
                        Constants$root.C_POINTER$LAYOUT.withName("priv")
                    ).withName("widget"),
                    Constants$root.C_POINTER$LAYOUT.withName("priv")
                ).withName("container"),
                Constants$root.C_POINTER$LAYOUT.withName("priv")
            ).withName("bin"),
            Constants$root.C_POINTER$LAYOUT.withName("priv")
        ).withName("menu_item")
    ).withName("_GtkSeparatorMenuItem");
    public static MemoryLayout $LAYOUT() {
        return _GtkSeparatorMenuItem.$struct$LAYOUT;
    }
    public static MemorySegment menu_item$slice(MemorySegment seg) {
        return seg.asSlice(0, 56);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


