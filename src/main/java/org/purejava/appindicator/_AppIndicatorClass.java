// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _AppIndicatorClass {
 *     struct _GObjectClass parent_class;
 *     void (*new_icon)(struct _AppIndicator*,void*);
 *     void (*new_attention_icon)(struct _AppIndicator*,void*);
 *     void (*new_status)(struct _AppIndicator*,char*,void*);
 *     void (*new_icon_theme_path)(struct _AppIndicator*,char*,void*);
 *     void (*new_label)(struct _AppIndicator*,char*,char*,void*);
 *     void (*connection_changed)(struct _AppIndicator*,int,void*);
 *     void (*scroll_event)(struct _AppIndicator*,int,enum GdkScrollDirection,void*);
 *     void (*app_indicator_reserved_ats)();
 *     struct _GtkStatusIcon* (*fallback)(struct _AppIndicator*);
 *     void (*unfallback)(struct _AppIndicator*,struct _GtkStatusIcon*);
 *     void (*app_indicator_reserved_1)();
 *     void (*app_indicator_reserved_2)();
 *     void (*app_indicator_reserved_3)();
 *     void (*app_indicator_reserved_4)();
 *     void (*app_indicator_reserved_5)();
 *     void (*app_indicator_reserved_6)();
 * };
 * }
 */
public class _AppIndicatorClass {

    public static MemoryLayout $LAYOUT() {
        return constants$3402.const$4;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    /**
     * {@snippet :
 * void (*new_icon)(struct _AppIndicator*,void*);
     * }
     */
    public interface new_icon {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(new_icon fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3402.const$5, fi, constants$13.const$4, scope);
        }
        static new_icon ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
                try {
                    constants$14.const$0.invokeExact(symbol, _tag, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle new_icon$VH() {
        return constants$3403.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*new_icon)(struct _AppIndicator*,void*);
     * }
     */
    public static MemorySegment new_icon$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3403.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*new_icon)(struct _AppIndicator*,void*);
     * }
     */
    public static void new_icon$set(MemorySegment seg, MemorySegment x) {
        constants$3403.const$0.set(seg, x);
    }
    public static MemorySegment new_icon$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3403.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void new_icon$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3403.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static new_icon new_icon(MemorySegment segment, Arena scope) {
        return new_icon.ofAddress(new_icon$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*new_attention_icon)(struct _AppIndicator*,void*);
     * }
     */
    public interface new_attention_icon {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(new_attention_icon fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3403.const$1, fi, constants$13.const$4, scope);
        }
        static new_attention_icon ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
                try {
                    constants$14.const$0.invokeExact(symbol, _tag, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle new_attention_icon$VH() {
        return constants$3403.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*new_attention_icon)(struct _AppIndicator*,void*);
     * }
     */
    public static MemorySegment new_attention_icon$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3403.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*new_attention_icon)(struct _AppIndicator*,void*);
     * }
     */
    public static void new_attention_icon$set(MemorySegment seg, MemorySegment x) {
        constants$3403.const$2.set(seg, x);
    }
    public static MemorySegment new_attention_icon$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3403.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void new_attention_icon$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3403.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static new_attention_icon new_attention_icon(MemorySegment segment, Arena scope) {
        return new_attention_icon.ofAddress(new_attention_icon$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*new_status)(struct _AppIndicator*,char*,void*);
     * }
     */
    public interface new_status {

        void apply(java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment value, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(new_status fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3403.const$3, fi, constants$14.const$3, scope);
        }
        static new_status ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _key, java.lang.foreign.MemorySegment _value, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    constants$14.const$5.invokeExact(symbol, _key, _value, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle new_status$VH() {
        return constants$3403.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*new_status)(struct _AppIndicator*,char*,void*);
     * }
     */
    public static MemorySegment new_status$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3403.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*new_status)(struct _AppIndicator*,char*,void*);
     * }
     */
    public static void new_status$set(MemorySegment seg, MemorySegment x) {
        constants$3403.const$4.set(seg, x);
    }
    public static MemorySegment new_status$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3403.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void new_status$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3403.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static new_status new_status(MemorySegment segment, Arena scope) {
        return new_status.ofAddress(new_status$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*new_icon_theme_path)(struct _AppIndicator*,char*,void*);
     * }
     */
    public interface new_icon_theme_path {

        void apply(java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment value, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(new_icon_theme_path fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3403.const$5, fi, constants$14.const$3, scope);
        }
        static new_icon_theme_path ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _key, java.lang.foreign.MemorySegment _value, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    constants$14.const$5.invokeExact(symbol, _key, _value, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle new_icon_theme_path$VH() {
        return constants$3404.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*new_icon_theme_path)(struct _AppIndicator*,char*,void*);
     * }
     */
    public static MemorySegment new_icon_theme_path$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3404.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*new_icon_theme_path)(struct _AppIndicator*,char*,void*);
     * }
     */
    public static void new_icon_theme_path$set(MemorySegment seg, MemorySegment x) {
        constants$3404.const$0.set(seg, x);
    }
    public static MemorySegment new_icon_theme_path$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3404.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void new_icon_theme_path$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3404.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static new_icon_theme_path new_icon_theme_path(MemorySegment segment, Arena scope) {
        return new_icon_theme_path.ofAddress(new_icon_theme_path$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*new_label)(struct _AppIndicator*,char*,char*,void*);
     * }
     */
    public interface new_label {

        void apply(java.lang.foreign.MemorySegment model, java.lang.foreign.MemorySegment path, java.lang.foreign.MemorySegment iter, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(new_label fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3404.const$1, fi, constants$42.const$1, scope);
        }
        static new_label ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _model, java.lang.foreign.MemorySegment _path, java.lang.foreign.MemorySegment _iter, java.lang.foreign.MemorySegment _data) -> {
                try {
                    constants$259.const$4.invokeExact(symbol, _model, _path, _iter, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle new_label$VH() {
        return constants$3404.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*new_label)(struct _AppIndicator*,char*,char*,void*);
     * }
     */
    public static MemorySegment new_label$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3404.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*new_label)(struct _AppIndicator*,char*,char*,void*);
     * }
     */
    public static void new_label$set(MemorySegment seg, MemorySegment x) {
        constants$3404.const$2.set(seg, x);
    }
    public static MemorySegment new_label$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3404.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void new_label$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3404.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static new_label new_label(MemorySegment segment, Arena scope) {
        return new_label.ofAddress(new_label$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*connection_changed)(struct _AppIndicator*,int,void*);
     * }
     */
    public interface connection_changed {

        void apply(java.lang.foreign.MemorySegment _x0, int _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(connection_changed fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3404.const$3, fi, constants$42.const$4, scope);
        }
        static connection_changed ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    constants$625.const$2.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle connection_changed$VH() {
        return constants$3404.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*connection_changed)(struct _AppIndicator*,int,void*);
     * }
     */
    public static MemorySegment connection_changed$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3404.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*connection_changed)(struct _AppIndicator*,int,void*);
     * }
     */
    public static void connection_changed$set(MemorySegment seg, MemorySegment x) {
        constants$3404.const$4.set(seg, x);
    }
    public static MemorySegment connection_changed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3404.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void connection_changed$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3404.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static connection_changed connection_changed(MemorySegment segment, Arena scope) {
        return connection_changed.ofAddress(connection_changed$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*scroll_event)(struct _AppIndicator*,int,enum GdkScrollDirection,void*);
     * }
     */
    public interface scroll_event {

        void apply(java.lang.foreign.MemorySegment _x0, int _x1, int _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(scroll_event fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3404.const$5, fi, constants$57.const$0, scope);
        }
        static scroll_event ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, int __x1, int __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    constants$1951.const$0.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle scroll_event$VH() {
        return constants$3405.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*scroll_event)(struct _AppIndicator*,int,enum GdkScrollDirection,void*);
     * }
     */
    public static MemorySegment scroll_event$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3405.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*scroll_event)(struct _AppIndicator*,int,enum GdkScrollDirection,void*);
     * }
     */
    public static void scroll_event$set(MemorySegment seg, MemorySegment x) {
        constants$3405.const$0.set(seg, x);
    }
    public static MemorySegment scroll_event$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3405.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void scroll_event$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3405.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static scroll_event scroll_event(MemorySegment segment, Arena scope) {
        return scroll_event.ofAddress(scroll_event$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*app_indicator_reserved_ats)();
     * }
     */
    public interface app_indicator_reserved_ats {

        void apply();
        static MemorySegment allocate(app_indicator_reserved_ats fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3405.const$1, fi, constants$7.const$5, scope);
        }
        static app_indicator_reserved_ats ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return () -> {
                try {
                    constants$64.const$1.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle app_indicator_reserved_ats$VH() {
        return constants$3405.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*app_indicator_reserved_ats)();
     * }
     */
    public static MemorySegment app_indicator_reserved_ats$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3405.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*app_indicator_reserved_ats)();
     * }
     */
    public static void app_indicator_reserved_ats$set(MemorySegment seg, MemorySegment x) {
        constants$3405.const$2.set(seg, x);
    }
    public static MemorySegment app_indicator_reserved_ats$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3405.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void app_indicator_reserved_ats$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3405.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static app_indicator_reserved_ats app_indicator_reserved_ats(MemorySegment segment, Arena scope) {
        return app_indicator_reserved_ats.ofAddress(app_indicator_reserved_ats$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _GtkStatusIcon* (*fallback)(struct _AppIndicator*);
     * }
     */
    public interface fallback {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(fallback fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3405.const$3, fi, constants$5.const$2, scope);
        }
        static fallback ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$99.const$0.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle fallback$VH() {
        return constants$3405.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GtkStatusIcon* (*fallback)(struct _AppIndicator*);
     * }
     */
    public static MemorySegment fallback$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3405.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GtkStatusIcon* (*fallback)(struct _AppIndicator*);
     * }
     */
    public static void fallback$set(MemorySegment seg, MemorySegment x) {
        constants$3405.const$4.set(seg, x);
    }
    public static MemorySegment fallback$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3405.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void fallback$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3405.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static fallback fallback(MemorySegment segment, Arena scope) {
        return fallback.ofAddress(fallback$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*unfallback)(struct _AppIndicator*,struct _GtkStatusIcon*);
     * }
     */
    public interface unfallback {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(unfallback fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3405.const$5, fi, constants$13.const$4, scope);
        }
        static unfallback ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
                try {
                    constants$14.const$0.invokeExact(symbol, _tag, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle unfallback$VH() {
        return constants$3406.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*unfallback)(struct _AppIndicator*,struct _GtkStatusIcon*);
     * }
     */
    public static MemorySegment unfallback$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3406.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*unfallback)(struct _AppIndicator*,struct _GtkStatusIcon*);
     * }
     */
    public static void unfallback$set(MemorySegment seg, MemorySegment x) {
        constants$3406.const$0.set(seg, x);
    }
    public static MemorySegment unfallback$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3406.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void unfallback$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3406.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static unfallback unfallback(MemorySegment segment, Arena scope) {
        return unfallback.ofAddress(unfallback$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*app_indicator_reserved_1)();
     * }
     */
    public interface app_indicator_reserved_1 {

        void apply();
        static MemorySegment allocate(app_indicator_reserved_1 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3406.const$1, fi, constants$7.const$5, scope);
        }
        static app_indicator_reserved_1 ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return () -> {
                try {
                    constants$64.const$1.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle app_indicator_reserved_1$VH() {
        return constants$3406.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*app_indicator_reserved_1)();
     * }
     */
    public static MemorySegment app_indicator_reserved_1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3406.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*app_indicator_reserved_1)();
     * }
     */
    public static void app_indicator_reserved_1$set(MemorySegment seg, MemorySegment x) {
        constants$3406.const$2.set(seg, x);
    }
    public static MemorySegment app_indicator_reserved_1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3406.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void app_indicator_reserved_1$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3406.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static app_indicator_reserved_1 app_indicator_reserved_1(MemorySegment segment, Arena scope) {
        return app_indicator_reserved_1.ofAddress(app_indicator_reserved_1$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*app_indicator_reserved_2)();
     * }
     */
    public interface app_indicator_reserved_2 {

        void apply();
        static MemorySegment allocate(app_indicator_reserved_2 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3406.const$3, fi, constants$7.const$5, scope);
        }
        static app_indicator_reserved_2 ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return () -> {
                try {
                    constants$64.const$1.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle app_indicator_reserved_2$VH() {
        return constants$3406.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*app_indicator_reserved_2)();
     * }
     */
    public static MemorySegment app_indicator_reserved_2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3406.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*app_indicator_reserved_2)();
     * }
     */
    public static void app_indicator_reserved_2$set(MemorySegment seg, MemorySegment x) {
        constants$3406.const$4.set(seg, x);
    }
    public static MemorySegment app_indicator_reserved_2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3406.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void app_indicator_reserved_2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3406.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static app_indicator_reserved_2 app_indicator_reserved_2(MemorySegment segment, Arena scope) {
        return app_indicator_reserved_2.ofAddress(app_indicator_reserved_2$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*app_indicator_reserved_3)();
     * }
     */
    public interface app_indicator_reserved_3 {

        void apply();
        static MemorySegment allocate(app_indicator_reserved_3 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3406.const$5, fi, constants$7.const$5, scope);
        }
        static app_indicator_reserved_3 ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return () -> {
                try {
                    constants$64.const$1.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle app_indicator_reserved_3$VH() {
        return constants$3407.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*app_indicator_reserved_3)();
     * }
     */
    public static MemorySegment app_indicator_reserved_3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3407.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*app_indicator_reserved_3)();
     * }
     */
    public static void app_indicator_reserved_3$set(MemorySegment seg, MemorySegment x) {
        constants$3407.const$0.set(seg, x);
    }
    public static MemorySegment app_indicator_reserved_3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3407.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void app_indicator_reserved_3$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3407.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static app_indicator_reserved_3 app_indicator_reserved_3(MemorySegment segment, Arena scope) {
        return app_indicator_reserved_3.ofAddress(app_indicator_reserved_3$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*app_indicator_reserved_4)();
     * }
     */
    public interface app_indicator_reserved_4 {

        void apply();
        static MemorySegment allocate(app_indicator_reserved_4 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3407.const$1, fi, constants$7.const$5, scope);
        }
        static app_indicator_reserved_4 ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return () -> {
                try {
                    constants$64.const$1.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle app_indicator_reserved_4$VH() {
        return constants$3407.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*app_indicator_reserved_4)();
     * }
     */
    public static MemorySegment app_indicator_reserved_4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3407.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*app_indicator_reserved_4)();
     * }
     */
    public static void app_indicator_reserved_4$set(MemorySegment seg, MemorySegment x) {
        constants$3407.const$2.set(seg, x);
    }
    public static MemorySegment app_indicator_reserved_4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3407.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void app_indicator_reserved_4$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3407.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static app_indicator_reserved_4 app_indicator_reserved_4(MemorySegment segment, Arena scope) {
        return app_indicator_reserved_4.ofAddress(app_indicator_reserved_4$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*app_indicator_reserved_5)();
     * }
     */
    public interface app_indicator_reserved_5 {

        void apply();
        static MemorySegment allocate(app_indicator_reserved_5 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3407.const$3, fi, constants$7.const$5, scope);
        }
        static app_indicator_reserved_5 ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return () -> {
                try {
                    constants$64.const$1.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle app_indicator_reserved_5$VH() {
        return constants$3407.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*app_indicator_reserved_5)();
     * }
     */
    public static MemorySegment app_indicator_reserved_5$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3407.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*app_indicator_reserved_5)();
     * }
     */
    public static void app_indicator_reserved_5$set(MemorySegment seg, MemorySegment x) {
        constants$3407.const$4.set(seg, x);
    }
    public static MemorySegment app_indicator_reserved_5$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3407.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void app_indicator_reserved_5$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3407.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static app_indicator_reserved_5 app_indicator_reserved_5(MemorySegment segment, Arena scope) {
        return app_indicator_reserved_5.ofAddress(app_indicator_reserved_5$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*app_indicator_reserved_6)();
     * }
     */
    public interface app_indicator_reserved_6 {

        void apply();
        static MemorySegment allocate(app_indicator_reserved_6 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3407.const$5, fi, constants$7.const$5, scope);
        }
        static app_indicator_reserved_6 ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return () -> {
                try {
                    constants$64.const$1.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle app_indicator_reserved_6$VH() {
        return constants$3408.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*app_indicator_reserved_6)();
     * }
     */
    public static MemorySegment app_indicator_reserved_6$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3408.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*app_indicator_reserved_6)();
     * }
     */
    public static void app_indicator_reserved_6$set(MemorySegment seg, MemorySegment x) {
        constants$3408.const$0.set(seg, x);
    }
    public static MemorySegment app_indicator_reserved_6$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3408.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void app_indicator_reserved_6$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3408.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static app_indicator_reserved_6 app_indicator_reserved_6(MemorySegment segment, Arena scope) {
        return app_indicator_reserved_6.ofAddress(app_indicator_reserved_6$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


