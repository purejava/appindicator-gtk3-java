// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class _GtkStatusIconClass {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_LONG_LONG$LAYOUT.withName("g_type")
            ).withName("g_type_class"),
            Constants$root.C_POINTER$LAYOUT.withName("construct_properties"),
            Constants$root.C_POINTER$LAYOUT.withName("constructor"),
            Constants$root.C_POINTER$LAYOUT.withName("set_property"),
            Constants$root.C_POINTER$LAYOUT.withName("get_property"),
            Constants$root.C_POINTER$LAYOUT.withName("dispose"),
            Constants$root.C_POINTER$LAYOUT.withName("finalize"),
            Constants$root.C_POINTER$LAYOUT.withName("dispatch_properties_changed"),
            Constants$root.C_POINTER$LAYOUT.withName("notify"),
            Constants$root.C_POINTER$LAYOUT.withName("constructed"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("flags"),
            MemoryLayout.sequenceLayout(6, Constants$root.C_POINTER$LAYOUT).withName("pdummy")
        ).withName("parent_class"),
        Constants$root.C_POINTER$LAYOUT.withName("activate"),
        Constants$root.C_POINTER$LAYOUT.withName("popup_menu"),
        Constants$root.C_POINTER$LAYOUT.withName("size_changed"),
        Constants$root.C_POINTER$LAYOUT.withName("button_press_event"),
        Constants$root.C_POINTER$LAYOUT.withName("button_release_event"),
        Constants$root.C_POINTER$LAYOUT.withName("scroll_event"),
        Constants$root.C_POINTER$LAYOUT.withName("query_tooltip"),
        Constants$root.C_POINTER$LAYOUT.withName("__gtk_reserved1"),
        Constants$root.C_POINTER$LAYOUT.withName("__gtk_reserved2"),
        Constants$root.C_POINTER$LAYOUT.withName("__gtk_reserved3"),
        Constants$root.C_POINTER$LAYOUT.withName("__gtk_reserved4")
    ).withName("_GtkStatusIconClass");
    public static MemoryLayout $LAYOUT() {
        return _GtkStatusIconClass.$struct$LAYOUT;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    static final FunctionDescriptor activate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle activate$MH = RuntimeHelper.downcallHandle(
        _GtkStatusIconClass.activate$FUNC
    );
    public interface activate {

        void apply(java.lang.foreign.MemoryAddress _x0);
        static MemorySegment allocate(activate fi, MemorySession session) {
            return RuntimeHelper.upcallStub(activate.class, fi, _GtkStatusIconClass.activate$FUNC, session);
        }
        static activate ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0) -> {
                try {
                    _GtkStatusIconClass.activate$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle activate$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("activate"));
    public static VarHandle activate$VH() {
        return _GtkStatusIconClass.activate$VH;
    }
    public static MemoryAddress activate$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkStatusIconClass.activate$VH.get(seg);
    }
    public static void activate$set( MemorySegment seg, MemoryAddress x) {
        _GtkStatusIconClass.activate$VH.set(seg, x);
    }
    public static MemoryAddress activate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkStatusIconClass.activate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void activate$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkStatusIconClass.activate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static activate activate (MemorySegment segment, MemorySession session) {
        return activate.ofAddress(activate$get(segment), session);
    }
    static final FunctionDescriptor popup_menu$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle popup_menu$MH = RuntimeHelper.downcallHandle(
        _GtkStatusIconClass.popup_menu$FUNC
    );
    public interface popup_menu {

        void apply(java.lang.foreign.MemoryAddress _x0, int _x1, int _x2);
        static MemorySegment allocate(popup_menu fi, MemorySession session) {
            return RuntimeHelper.upcallStub(popup_menu.class, fi, _GtkStatusIconClass.popup_menu$FUNC, session);
        }
        static popup_menu ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, int __x2) -> {
                try {
                    _GtkStatusIconClass.popup_menu$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle popup_menu$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("popup_menu"));
    public static VarHandle popup_menu$VH() {
        return _GtkStatusIconClass.popup_menu$VH;
    }
    public static MemoryAddress popup_menu$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkStatusIconClass.popup_menu$VH.get(seg);
    }
    public static void popup_menu$set( MemorySegment seg, MemoryAddress x) {
        _GtkStatusIconClass.popup_menu$VH.set(seg, x);
    }
    public static MemoryAddress popup_menu$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkStatusIconClass.popup_menu$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void popup_menu$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkStatusIconClass.popup_menu$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static popup_menu popup_menu (MemorySegment segment, MemorySession session) {
        return popup_menu.ofAddress(popup_menu$get(segment), session);
    }
    static final FunctionDescriptor size_changed$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle size_changed$MH = RuntimeHelper.downcallHandle(
        _GtkStatusIconClass.size_changed$FUNC
    );
    public interface size_changed {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1);
        static MemorySegment allocate(size_changed fi, MemorySession session) {
            return RuntimeHelper.upcallStub(size_changed.class, fi, _GtkStatusIconClass.size_changed$FUNC, session);
        }
        static size_changed ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1) -> {
                try {
                    return (int)_GtkStatusIconClass.size_changed$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle size_changed$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("size_changed"));
    public static VarHandle size_changed$VH() {
        return _GtkStatusIconClass.size_changed$VH;
    }
    public static MemoryAddress size_changed$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkStatusIconClass.size_changed$VH.get(seg);
    }
    public static void size_changed$set( MemorySegment seg, MemoryAddress x) {
        _GtkStatusIconClass.size_changed$VH.set(seg, x);
    }
    public static MemoryAddress size_changed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkStatusIconClass.size_changed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void size_changed$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkStatusIconClass.size_changed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static size_changed size_changed (MemorySegment segment, MemorySession session) {
        return size_changed.ofAddress(size_changed$get(segment), session);
    }
    static final FunctionDescriptor button_press_event$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle button_press_event$MH = RuntimeHelper.downcallHandle(
        _GtkStatusIconClass.button_press_event$FUNC
    );
    public interface button_press_event {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(button_press_event fi, MemorySession session) {
            return RuntimeHelper.upcallStub(button_press_event.class, fi, _GtkStatusIconClass.button_press_event$FUNC, session);
        }
        static button_press_event ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)_GtkStatusIconClass.button_press_event$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle button_press_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("button_press_event"));
    public static VarHandle button_press_event$VH() {
        return _GtkStatusIconClass.button_press_event$VH;
    }
    public static MemoryAddress button_press_event$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkStatusIconClass.button_press_event$VH.get(seg);
    }
    public static void button_press_event$set( MemorySegment seg, MemoryAddress x) {
        _GtkStatusIconClass.button_press_event$VH.set(seg, x);
    }
    public static MemoryAddress button_press_event$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkStatusIconClass.button_press_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void button_press_event$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkStatusIconClass.button_press_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static button_press_event button_press_event (MemorySegment segment, MemorySession session) {
        return button_press_event.ofAddress(button_press_event$get(segment), session);
    }
    static final FunctionDescriptor button_release_event$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle button_release_event$MH = RuntimeHelper.downcallHandle(
        _GtkStatusIconClass.button_release_event$FUNC
    );
    public interface button_release_event {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(button_release_event fi, MemorySession session) {
            return RuntimeHelper.upcallStub(button_release_event.class, fi, _GtkStatusIconClass.button_release_event$FUNC, session);
        }
        static button_release_event ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)_GtkStatusIconClass.button_release_event$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle button_release_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("button_release_event"));
    public static VarHandle button_release_event$VH() {
        return _GtkStatusIconClass.button_release_event$VH;
    }
    public static MemoryAddress button_release_event$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkStatusIconClass.button_release_event$VH.get(seg);
    }
    public static void button_release_event$set( MemorySegment seg, MemoryAddress x) {
        _GtkStatusIconClass.button_release_event$VH.set(seg, x);
    }
    public static MemoryAddress button_release_event$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkStatusIconClass.button_release_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void button_release_event$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkStatusIconClass.button_release_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static button_release_event button_release_event (MemorySegment segment, MemorySession session) {
        return button_release_event.ofAddress(button_release_event$get(segment), session);
    }
    static final FunctionDescriptor scroll_event$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle scroll_event$MH = RuntimeHelper.downcallHandle(
        _GtkStatusIconClass.scroll_event$FUNC
    );
    public interface scroll_event {

        int apply(java.lang.foreign.MemoryAddress _x0, java.lang.foreign.MemoryAddress _x1);
        static MemorySegment allocate(scroll_event fi, MemorySession session) {
            return RuntimeHelper.upcallStub(scroll_event.class, fi, _GtkStatusIconClass.scroll_event$FUNC, session);
        }
        static scroll_event ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, java.lang.foreign.MemoryAddress __x1) -> {
                try {
                    return (int)_GtkStatusIconClass.scroll_event$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, (java.lang.foreign.Addressable)__x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle scroll_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("scroll_event"));
    public static VarHandle scroll_event$VH() {
        return _GtkStatusIconClass.scroll_event$VH;
    }
    public static MemoryAddress scroll_event$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkStatusIconClass.scroll_event$VH.get(seg);
    }
    public static void scroll_event$set( MemorySegment seg, MemoryAddress x) {
        _GtkStatusIconClass.scroll_event$VH.set(seg, x);
    }
    public static MemoryAddress scroll_event$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkStatusIconClass.scroll_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void scroll_event$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkStatusIconClass.scroll_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static scroll_event scroll_event (MemorySegment segment, MemorySession session) {
        return scroll_event.ofAddress(scroll_event$get(segment), session);
    }
    static final FunctionDescriptor query_tooltip$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle query_tooltip$MH = RuntimeHelper.downcallHandle(
        _GtkStatusIconClass.query_tooltip$FUNC
    );
    public interface query_tooltip {

        int apply(java.lang.foreign.MemoryAddress _x0, int _x1, int _x2, int _x3, java.lang.foreign.MemoryAddress _x4);
        static MemorySegment allocate(query_tooltip fi, MemorySession session) {
            return RuntimeHelper.upcallStub(query_tooltip.class, fi, _GtkStatusIconClass.query_tooltip$FUNC, session);
        }
        static query_tooltip ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return (java.lang.foreign.MemoryAddress __x0, int __x1, int __x2, int __x3, java.lang.foreign.MemoryAddress __x4) -> {
                try {
                    return (int)_GtkStatusIconClass.query_tooltip$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)__x0, __x1, __x2, __x3, (java.lang.foreign.Addressable)__x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle query_tooltip$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("query_tooltip"));
    public static VarHandle query_tooltip$VH() {
        return _GtkStatusIconClass.query_tooltip$VH;
    }
    public static MemoryAddress query_tooltip$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkStatusIconClass.query_tooltip$VH.get(seg);
    }
    public static void query_tooltip$set( MemorySegment seg, MemoryAddress x) {
        _GtkStatusIconClass.query_tooltip$VH.set(seg, x);
    }
    public static MemoryAddress query_tooltip$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkStatusIconClass.query_tooltip$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void query_tooltip$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkStatusIconClass.query_tooltip$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static query_tooltip query_tooltip (MemorySegment segment, MemorySession session) {
        return query_tooltip.ofAddress(query_tooltip$get(segment), session);
    }
    static final FunctionDescriptor __gtk_reserved1$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle __gtk_reserved1$MH = RuntimeHelper.downcallHandle(
        _GtkStatusIconClass.__gtk_reserved1$FUNC
    );
    public interface __gtk_reserved1 {

        void apply();
        static MemorySegment allocate(__gtk_reserved1 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(__gtk_reserved1.class, fi, _GtkStatusIconClass.__gtk_reserved1$FUNC, session);
        }
        static __gtk_reserved1 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GtkStatusIconClass.__gtk_reserved1$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle __gtk_reserved1$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__gtk_reserved1"));
    public static VarHandle __gtk_reserved1$VH() {
        return _GtkStatusIconClass.__gtk_reserved1$VH;
    }
    public static MemoryAddress __gtk_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkStatusIconClass.__gtk_reserved1$VH.get(seg);
    }
    public static void __gtk_reserved1$set( MemorySegment seg, MemoryAddress x) {
        _GtkStatusIconClass.__gtk_reserved1$VH.set(seg, x);
    }
    public static MemoryAddress __gtk_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkStatusIconClass.__gtk_reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __gtk_reserved1$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkStatusIconClass.__gtk_reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static __gtk_reserved1 __gtk_reserved1 (MemorySegment segment, MemorySession session) {
        return __gtk_reserved1.ofAddress(__gtk_reserved1$get(segment), session);
    }
    static final FunctionDescriptor __gtk_reserved2$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle __gtk_reserved2$MH = RuntimeHelper.downcallHandle(
        _GtkStatusIconClass.__gtk_reserved2$FUNC
    );
    public interface __gtk_reserved2 {

        void apply();
        static MemorySegment allocate(__gtk_reserved2 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(__gtk_reserved2.class, fi, _GtkStatusIconClass.__gtk_reserved2$FUNC, session);
        }
        static __gtk_reserved2 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GtkStatusIconClass.__gtk_reserved2$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle __gtk_reserved2$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__gtk_reserved2"));
    public static VarHandle __gtk_reserved2$VH() {
        return _GtkStatusIconClass.__gtk_reserved2$VH;
    }
    public static MemoryAddress __gtk_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkStatusIconClass.__gtk_reserved2$VH.get(seg);
    }
    public static void __gtk_reserved2$set( MemorySegment seg, MemoryAddress x) {
        _GtkStatusIconClass.__gtk_reserved2$VH.set(seg, x);
    }
    public static MemoryAddress __gtk_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkStatusIconClass.__gtk_reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __gtk_reserved2$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkStatusIconClass.__gtk_reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static __gtk_reserved2 __gtk_reserved2 (MemorySegment segment, MemorySession session) {
        return __gtk_reserved2.ofAddress(__gtk_reserved2$get(segment), session);
    }
    static final FunctionDescriptor __gtk_reserved3$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle __gtk_reserved3$MH = RuntimeHelper.downcallHandle(
        _GtkStatusIconClass.__gtk_reserved3$FUNC
    );
    public interface __gtk_reserved3 {

        void apply();
        static MemorySegment allocate(__gtk_reserved3 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(__gtk_reserved3.class, fi, _GtkStatusIconClass.__gtk_reserved3$FUNC, session);
        }
        static __gtk_reserved3 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GtkStatusIconClass.__gtk_reserved3$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle __gtk_reserved3$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__gtk_reserved3"));
    public static VarHandle __gtk_reserved3$VH() {
        return _GtkStatusIconClass.__gtk_reserved3$VH;
    }
    public static MemoryAddress __gtk_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkStatusIconClass.__gtk_reserved3$VH.get(seg);
    }
    public static void __gtk_reserved3$set( MemorySegment seg, MemoryAddress x) {
        _GtkStatusIconClass.__gtk_reserved3$VH.set(seg, x);
    }
    public static MemoryAddress __gtk_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkStatusIconClass.__gtk_reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __gtk_reserved3$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkStatusIconClass.__gtk_reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static __gtk_reserved3 __gtk_reserved3 (MemorySegment segment, MemorySession session) {
        return __gtk_reserved3.ofAddress(__gtk_reserved3$get(segment), session);
    }
    static final FunctionDescriptor __gtk_reserved4$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle __gtk_reserved4$MH = RuntimeHelper.downcallHandle(
        _GtkStatusIconClass.__gtk_reserved4$FUNC
    );
    public interface __gtk_reserved4 {

        void apply();
        static MemorySegment allocate(__gtk_reserved4 fi, MemorySession session) {
            return RuntimeHelper.upcallStub(__gtk_reserved4.class, fi, _GtkStatusIconClass.__gtk_reserved4$FUNC, session);
        }
        static __gtk_reserved4 ofAddress(MemoryAddress addr, MemorySession session) {
            MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
            return () -> {
                try {
                    _GtkStatusIconClass.__gtk_reserved4$MH.invokeExact((Addressable)symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle __gtk_reserved4$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("__gtk_reserved4"));
    public static VarHandle __gtk_reserved4$VH() {
        return _GtkStatusIconClass.__gtk_reserved4$VH;
    }
    public static MemoryAddress __gtk_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)_GtkStatusIconClass.__gtk_reserved4$VH.get(seg);
    }
    public static void __gtk_reserved4$set( MemorySegment seg, MemoryAddress x) {
        _GtkStatusIconClass.__gtk_reserved4$VH.set(seg, x);
    }
    public static MemoryAddress __gtk_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)_GtkStatusIconClass.__gtk_reserved4$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __gtk_reserved4$set(MemorySegment seg, long index, MemoryAddress x) {
        _GtkStatusIconClass.__gtk_reserved4$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static __gtk_reserved4 __gtk_reserved4 (MemorySegment segment, MemorySession session) {
        return __gtk_reserved4.ofAddress(__gtk_reserved4$get(segment), session);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


