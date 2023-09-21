// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GtkTextBufferClass {
 *     struct _GObjectClass parent_class;
 *     void (*insert_text)(struct _GtkTextBuffer*,struct _GtkTextIter*,char*,int);
 *     void (*insert_pixbuf)(struct _GtkTextBuffer*,struct _GtkTextIter*,struct _GdkPixbuf*);
 *     void (*insert_child_anchor)(struct _GtkTextBuffer*,struct _GtkTextIter*,struct _GtkTextChildAnchor*);
 *     void (*delete_range)(struct _GtkTextBuffer*,struct _GtkTextIter*,struct _GtkTextIter*);
 *     void (*changed)(struct _GtkTextBuffer*);
 *     void (*modified_changed)(struct _GtkTextBuffer*);
 *     void (*mark_set)(struct _GtkTextBuffer*,struct _GtkTextIter*,struct _GtkTextMark*);
 *     void (*mark_deleted)(struct _GtkTextBuffer*,struct _GtkTextMark*);
 *     void (*apply_tag)(struct _GtkTextBuffer*,struct _GtkTextTag*,struct _GtkTextIter*,struct _GtkTextIter*);
 *     void (*remove_tag)(struct _GtkTextBuffer*,struct _GtkTextTag*,struct _GtkTextIter*,struct _GtkTextIter*);
 *     void (*begin_user_action)(struct _GtkTextBuffer*);
 *     void (*end_user_action)(struct _GtkTextBuffer*);
 *     void (*paste_done)(struct _GtkTextBuffer*,struct _GtkClipboard*);
 *     void (*_gtk_reserved1)();
 *     void (*_gtk_reserved2)();
 *     void (*_gtk_reserved3)();
 *     void (*_gtk_reserved4)();
 * };
 * }
 */
public class _GtkTextBufferClass {

    public static MemoryLayout $LAYOUT() {
        return constants$3124.const$0;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    /**
     * {@snippet :
 * void (*insert_text)(struct _GtkTextBuffer*,struct _GtkTextIter*,char*,int);
     * }
     */
    public interface insert_text {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, int _x3);
        static MemorySegment allocate(insert_text fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3124.const$1, fi, constants$331.const$4, scope);
        }
        static insert_text ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, int __x3) -> {
                try {
                    constants$1085.const$4.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle insert_text$VH() {
        return constants$3124.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*insert_text)(struct _GtkTextBuffer*,struct _GtkTextIter*,char*,int);
     * }
     */
    public static MemorySegment insert_text$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3124.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*insert_text)(struct _GtkTextBuffer*,struct _GtkTextIter*,char*,int);
     * }
     */
    public static void insert_text$set(MemorySegment seg, MemorySegment x) {
        constants$3124.const$2.set(seg, x);
    }
    public static MemorySegment insert_text$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3124.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void insert_text$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3124.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static insert_text insert_text(MemorySegment segment, Arena scope) {
        return insert_text.ofAddress(insert_text$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*insert_pixbuf)(struct _GtkTextBuffer*,struct _GtkTextIter*,struct _GdkPixbuf*);
     * }
     */
    public interface insert_pixbuf {

        void apply(java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment value, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(insert_pixbuf fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3124.const$3, fi, constants$14.const$3, scope);
        }
        static insert_pixbuf ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle insert_pixbuf$VH() {
        return constants$3124.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*insert_pixbuf)(struct _GtkTextBuffer*,struct _GtkTextIter*,struct _GdkPixbuf*);
     * }
     */
    public static MemorySegment insert_pixbuf$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3124.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*insert_pixbuf)(struct _GtkTextBuffer*,struct _GtkTextIter*,struct _GdkPixbuf*);
     * }
     */
    public static void insert_pixbuf$set(MemorySegment seg, MemorySegment x) {
        constants$3124.const$4.set(seg, x);
    }
    public static MemorySegment insert_pixbuf$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3124.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void insert_pixbuf$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3124.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static insert_pixbuf insert_pixbuf(MemorySegment segment, Arena scope) {
        return insert_pixbuf.ofAddress(insert_pixbuf$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*insert_child_anchor)(struct _GtkTextBuffer*,struct _GtkTextIter*,struct _GtkTextChildAnchor*);
     * }
     */
    public interface insert_child_anchor {

        void apply(java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment value, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(insert_child_anchor fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3124.const$5, fi, constants$14.const$3, scope);
        }
        static insert_child_anchor ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle insert_child_anchor$VH() {
        return constants$3125.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*insert_child_anchor)(struct _GtkTextBuffer*,struct _GtkTextIter*,struct _GtkTextChildAnchor*);
     * }
     */
    public static MemorySegment insert_child_anchor$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3125.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*insert_child_anchor)(struct _GtkTextBuffer*,struct _GtkTextIter*,struct _GtkTextChildAnchor*);
     * }
     */
    public static void insert_child_anchor$set(MemorySegment seg, MemorySegment x) {
        constants$3125.const$0.set(seg, x);
    }
    public static MemorySegment insert_child_anchor$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3125.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void insert_child_anchor$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3125.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static insert_child_anchor insert_child_anchor(MemorySegment segment, Arena scope) {
        return insert_child_anchor.ofAddress(insert_child_anchor$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*delete_range)(struct _GtkTextBuffer*,struct _GtkTextIter*,struct _GtkTextIter*);
     * }
     */
    public interface delete_range {

        void apply(java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment value, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(delete_range fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3125.const$1, fi, constants$14.const$3, scope);
        }
        static delete_range ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle delete_range$VH() {
        return constants$3125.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*delete_range)(struct _GtkTextBuffer*,struct _GtkTextIter*,struct _GtkTextIter*);
     * }
     */
    public static MemorySegment delete_range$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3125.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*delete_range)(struct _GtkTextBuffer*,struct _GtkTextIter*,struct _GtkTextIter*);
     * }
     */
    public static void delete_range$set(MemorySegment seg, MemorySegment x) {
        constants$3125.const$2.set(seg, x);
    }
    public static MemorySegment delete_range$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3125.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void delete_range$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3125.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static delete_range delete_range(MemorySegment segment, Arena scope) {
        return delete_range.ofAddress(delete_range$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*changed)(struct _GtkTextBuffer*);
     * }
     */
    public interface changed {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(changed fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3125.const$3, fi, constants$13.const$1, scope);
        }
        static changed ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _display) -> {
                try {
                    constants$13.const$3.invokeExact(symbol, _display);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle changed$VH() {
        return constants$3125.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*changed)(struct _GtkTextBuffer*);
     * }
     */
    public static MemorySegment changed$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3125.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*changed)(struct _GtkTextBuffer*);
     * }
     */
    public static void changed$set(MemorySegment seg, MemorySegment x) {
        constants$3125.const$4.set(seg, x);
    }
    public static MemorySegment changed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3125.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void changed$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3125.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static changed changed(MemorySegment segment, Arena scope) {
        return changed.ofAddress(changed$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*modified_changed)(struct _GtkTextBuffer*);
     * }
     */
    public interface modified_changed {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(modified_changed fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3125.const$5, fi, constants$13.const$1, scope);
        }
        static modified_changed ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _display) -> {
                try {
                    constants$13.const$3.invokeExact(symbol, _display);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle modified_changed$VH() {
        return constants$3126.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*modified_changed)(struct _GtkTextBuffer*);
     * }
     */
    public static MemorySegment modified_changed$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3126.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*modified_changed)(struct _GtkTextBuffer*);
     * }
     */
    public static void modified_changed$set(MemorySegment seg, MemorySegment x) {
        constants$3126.const$0.set(seg, x);
    }
    public static MemorySegment modified_changed$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3126.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void modified_changed$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3126.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static modified_changed modified_changed(MemorySegment segment, Arena scope) {
        return modified_changed.ofAddress(modified_changed$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*mark_set)(struct _GtkTextBuffer*,struct _GtkTextIter*,struct _GtkTextMark*);
     * }
     */
    public interface mark_set {

        void apply(java.lang.foreign.MemorySegment key, java.lang.foreign.MemorySegment value, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(mark_set fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3126.const$1, fi, constants$14.const$3, scope);
        }
        static mark_set ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle mark_set$VH() {
        return constants$3126.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*mark_set)(struct _GtkTextBuffer*,struct _GtkTextIter*,struct _GtkTextMark*);
     * }
     */
    public static MemorySegment mark_set$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3126.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*mark_set)(struct _GtkTextBuffer*,struct _GtkTextIter*,struct _GtkTextMark*);
     * }
     */
    public static void mark_set$set(MemorySegment seg, MemorySegment x) {
        constants$3126.const$2.set(seg, x);
    }
    public static MemorySegment mark_set$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3126.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void mark_set$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3126.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static mark_set mark_set(MemorySegment segment, Arena scope) {
        return mark_set.ofAddress(mark_set$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*mark_deleted)(struct _GtkTextBuffer*,struct _GtkTextMark*);
     * }
     */
    public interface mark_deleted {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(mark_deleted fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3126.const$3, fi, constants$13.const$4, scope);
        }
        static mark_deleted ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle mark_deleted$VH() {
        return constants$3126.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*mark_deleted)(struct _GtkTextBuffer*,struct _GtkTextMark*);
     * }
     */
    public static MemorySegment mark_deleted$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3126.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*mark_deleted)(struct _GtkTextBuffer*,struct _GtkTextMark*);
     * }
     */
    public static void mark_deleted$set(MemorySegment seg, MemorySegment x) {
        constants$3126.const$4.set(seg, x);
    }
    public static MemorySegment mark_deleted$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3126.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void mark_deleted$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3126.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static mark_deleted mark_deleted(MemorySegment segment, Arena scope) {
        return mark_deleted.ofAddress(mark_deleted$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*apply_tag)(struct _GtkTextBuffer*,struct _GtkTextTag*,struct _GtkTextIter*,struct _GtkTextIter*);
     * }
     */
    public interface apply_tag {

        void apply(java.lang.foreign.MemorySegment model, java.lang.foreign.MemorySegment path, java.lang.foreign.MemorySegment iter, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(apply_tag fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3126.const$5, fi, constants$42.const$1, scope);
        }
        static apply_tag ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle apply_tag$VH() {
        return constants$3127.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*apply_tag)(struct _GtkTextBuffer*,struct _GtkTextTag*,struct _GtkTextIter*,struct _GtkTextIter*);
     * }
     */
    public static MemorySegment apply_tag$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3127.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*apply_tag)(struct _GtkTextBuffer*,struct _GtkTextTag*,struct _GtkTextIter*,struct _GtkTextIter*);
     * }
     */
    public static void apply_tag$set(MemorySegment seg, MemorySegment x) {
        constants$3127.const$0.set(seg, x);
    }
    public static MemorySegment apply_tag$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3127.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void apply_tag$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3127.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static apply_tag apply_tag(MemorySegment segment, Arena scope) {
        return apply_tag.ofAddress(apply_tag$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*remove_tag)(struct _GtkTextBuffer*,struct _GtkTextTag*,struct _GtkTextIter*,struct _GtkTextIter*);
     * }
     */
    public interface remove_tag {

        void apply(java.lang.foreign.MemorySegment model, java.lang.foreign.MemorySegment path, java.lang.foreign.MemorySegment iter, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(remove_tag fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3127.const$1, fi, constants$42.const$1, scope);
        }
        static remove_tag ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle remove_tag$VH() {
        return constants$3127.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*remove_tag)(struct _GtkTextBuffer*,struct _GtkTextTag*,struct _GtkTextIter*,struct _GtkTextIter*);
     * }
     */
    public static MemorySegment remove_tag$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3127.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*remove_tag)(struct _GtkTextBuffer*,struct _GtkTextTag*,struct _GtkTextIter*,struct _GtkTextIter*);
     * }
     */
    public static void remove_tag$set(MemorySegment seg, MemorySegment x) {
        constants$3127.const$2.set(seg, x);
    }
    public static MemorySegment remove_tag$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3127.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void remove_tag$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3127.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static remove_tag remove_tag(MemorySegment segment, Arena scope) {
        return remove_tag.ofAddress(remove_tag$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*begin_user_action)(struct _GtkTextBuffer*);
     * }
     */
    public interface begin_user_action {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(begin_user_action fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3127.const$3, fi, constants$13.const$1, scope);
        }
        static begin_user_action ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _display) -> {
                try {
                    constants$13.const$3.invokeExact(symbol, _display);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle begin_user_action$VH() {
        return constants$3127.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*begin_user_action)(struct _GtkTextBuffer*);
     * }
     */
    public static MemorySegment begin_user_action$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3127.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*begin_user_action)(struct _GtkTextBuffer*);
     * }
     */
    public static void begin_user_action$set(MemorySegment seg, MemorySegment x) {
        constants$3127.const$4.set(seg, x);
    }
    public static MemorySegment begin_user_action$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3127.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void begin_user_action$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3127.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static begin_user_action begin_user_action(MemorySegment segment, Arena scope) {
        return begin_user_action.ofAddress(begin_user_action$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*end_user_action)(struct _GtkTextBuffer*);
     * }
     */
    public interface end_user_action {

        void apply(java.lang.foreign.MemorySegment display);
        static MemorySegment allocate(end_user_action fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3127.const$5, fi, constants$13.const$1, scope);
        }
        static end_user_action ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _display) -> {
                try {
                    constants$13.const$3.invokeExact(symbol, _display);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle end_user_action$VH() {
        return constants$3128.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*end_user_action)(struct _GtkTextBuffer*);
     * }
     */
    public static MemorySegment end_user_action$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3128.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*end_user_action)(struct _GtkTextBuffer*);
     * }
     */
    public static void end_user_action$set(MemorySegment seg, MemorySegment x) {
        constants$3128.const$0.set(seg, x);
    }
    public static MemorySegment end_user_action$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3128.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void end_user_action$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3128.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static end_user_action end_user_action(MemorySegment segment, Arena scope) {
        return end_user_action.ofAddress(end_user_action$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*paste_done)(struct _GtkTextBuffer*,struct _GtkClipboard*);
     * }
     */
    public interface paste_done {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(paste_done fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3128.const$1, fi, constants$13.const$4, scope);
        }
        static paste_done ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle paste_done$VH() {
        return constants$3128.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*paste_done)(struct _GtkTextBuffer*,struct _GtkClipboard*);
     * }
     */
    public static MemorySegment paste_done$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3128.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*paste_done)(struct _GtkTextBuffer*,struct _GtkClipboard*);
     * }
     */
    public static void paste_done$set(MemorySegment seg, MemorySegment x) {
        constants$3128.const$2.set(seg, x);
    }
    public static MemorySegment paste_done$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3128.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void paste_done$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3128.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static paste_done paste_done(MemorySegment segment, Arena scope) {
        return paste_done.ofAddress(paste_done$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved1)();
     * }
     */
    public interface _gtk_reserved1 {

        void apply();
        static MemorySegment allocate(_gtk_reserved1 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3128.const$3, fi, constants$7.const$5, scope);
        }
        static _gtk_reserved1 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _gtk_reserved1$VH() {
        return constants$3128.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3128.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved1)();
     * }
     */
    public static void _gtk_reserved1$set(MemorySegment seg, MemorySegment x) {
        constants$3128.const$4.set(seg, x);
    }
    public static MemorySegment _gtk_reserved1$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3128.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved1$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3128.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved1 _gtk_reserved1(MemorySegment segment, Arena scope) {
        return _gtk_reserved1.ofAddress(_gtk_reserved1$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved2)();
     * }
     */
    public interface _gtk_reserved2 {

        void apply();
        static MemorySegment allocate(_gtk_reserved2 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3128.const$5, fi, constants$7.const$5, scope);
        }
        static _gtk_reserved2 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _gtk_reserved2$VH() {
        return constants$3129.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3129.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved2)();
     * }
     */
    public static void _gtk_reserved2$set(MemorySegment seg, MemorySegment x) {
        constants$3129.const$0.set(seg, x);
    }
    public static MemorySegment _gtk_reserved2$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3129.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved2$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3129.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved2 _gtk_reserved2(MemorySegment segment, Arena scope) {
        return _gtk_reserved2.ofAddress(_gtk_reserved2$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved3)();
     * }
     */
    public interface _gtk_reserved3 {

        void apply();
        static MemorySegment allocate(_gtk_reserved3 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3129.const$1, fi, constants$7.const$5, scope);
        }
        static _gtk_reserved3 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _gtk_reserved3$VH() {
        return constants$3129.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3129.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved3)();
     * }
     */
    public static void _gtk_reserved3$set(MemorySegment seg, MemorySegment x) {
        constants$3129.const$2.set(seg, x);
    }
    public static MemorySegment _gtk_reserved3$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3129.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved3$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3129.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved3 _gtk_reserved3(MemorySegment segment, Arena scope) {
        return _gtk_reserved3.ofAddress(_gtk_reserved3$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*_gtk_reserved4)();
     * }
     */
    public interface _gtk_reserved4 {

        void apply();
        static MemorySegment allocate(_gtk_reserved4 fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$3129.const$3, fi, constants$7.const$5, scope);
        }
        static _gtk_reserved4 ofAddress(MemorySegment addr, Arena arena) {
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

    public static VarHandle _gtk_reserved4$VH() {
        return constants$3129.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$3129.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*_gtk_reserved4)();
     * }
     */
    public static void _gtk_reserved4$set(MemorySegment seg, MemorySegment x) {
        constants$3129.const$4.set(seg, x);
    }
    public static MemorySegment _gtk_reserved4$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$3129.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void _gtk_reserved4$set(MemorySegment seg, long index, MemorySegment x) {
        constants$3129.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static _gtk_reserved4 _gtk_reserved4(MemorySegment segment, Arena scope) {
        return _gtk_reserved4.ofAddress(_gtk_reserved4$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

