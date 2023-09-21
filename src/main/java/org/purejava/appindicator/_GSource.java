// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GSource {
 *     void* callback_data;
 *     struct _GSourceCallbackFuncs* callback_funcs;
 *     struct _GSourceFuncs* source_funcs;
 *     unsigned int ref_count;
 *     struct _GMainContext* context;
 *     int priority;
 *     unsigned int flags;
 *     unsigned int source_id;
 *     struct _GSList* poll_fds;
 *     struct _GSource* prev;
 *     struct _GSource* next;
 *     char* name;
 *     struct _GSourcePrivate* priv;
 * };
 * }
 */
public class _GSource {

    public static MemoryLayout $LAYOUT() {
        return constants$256.const$2;
    }
    public static VarHandle callback_data$VH() {
        return constants$256.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* callback_data;
     * }
     */
    public static MemorySegment callback_data$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$256.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* callback_data;
     * }
     */
    public static void callback_data$set(MemorySegment seg, MemorySegment x) {
        constants$256.const$3.set(seg, x);
    }
    public static MemorySegment callback_data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$256.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void callback_data$set(MemorySegment seg, long index, MemorySegment x) {
        constants$256.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle callback_funcs$VH() {
        return constants$256.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GSourceCallbackFuncs* callback_funcs;
     * }
     */
    public static MemorySegment callback_funcs$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$256.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GSourceCallbackFuncs* callback_funcs;
     * }
     */
    public static void callback_funcs$set(MemorySegment seg, MemorySegment x) {
        constants$256.const$4.set(seg, x);
    }
    public static MemorySegment callback_funcs$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$256.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void callback_funcs$set(MemorySegment seg, long index, MemorySegment x) {
        constants$256.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle source_funcs$VH() {
        return constants$256.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GSourceFuncs* source_funcs;
     * }
     */
    public static MemorySegment source_funcs$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$256.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GSourceFuncs* source_funcs;
     * }
     */
    public static void source_funcs$set(MemorySegment seg, MemorySegment x) {
        constants$256.const$5.set(seg, x);
    }
    public static MemorySegment source_funcs$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$256.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void source_funcs$set(MemorySegment seg, long index, MemorySegment x) {
        constants$256.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle ref_count$VH() {
        return constants$257.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int ref_count;
     * }
     */
    public static int ref_count$get(MemorySegment seg) {
        return (int)constants$257.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int ref_count;
     * }
     */
    public static void ref_count$set(MemorySegment seg, int x) {
        constants$257.const$0.set(seg, x);
    }
    public static int ref_count$get(MemorySegment seg, long index) {
        return (int)constants$257.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void ref_count$set(MemorySegment seg, long index, int x) {
        constants$257.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle context$VH() {
        return constants$257.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GMainContext* context;
     * }
     */
    public static MemorySegment context$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$257.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GMainContext* context;
     * }
     */
    public static void context$set(MemorySegment seg, MemorySegment x) {
        constants$257.const$1.set(seg, x);
    }
    public static MemorySegment context$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$257.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void context$set(MemorySegment seg, long index, MemorySegment x) {
        constants$257.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle priority$VH() {
        return constants$257.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int priority;
     * }
     */
    public static int priority$get(MemorySegment seg) {
        return (int)constants$257.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int priority;
     * }
     */
    public static void priority$set(MemorySegment seg, int x) {
        constants$257.const$2.set(seg, x);
    }
    public static int priority$get(MemorySegment seg, long index) {
        return (int)constants$257.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void priority$set(MemorySegment seg, long index, int x) {
        constants$257.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle flags$VH() {
        return constants$257.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)constants$257.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        constants$257.const$3.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)constants$257.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        constants$257.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle source_id$VH() {
        return constants$257.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int source_id;
     * }
     */
    public static int source_id$get(MemorySegment seg) {
        return (int)constants$257.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int source_id;
     * }
     */
    public static void source_id$set(MemorySegment seg, int x) {
        constants$257.const$4.set(seg, x);
    }
    public static int source_id$get(MemorySegment seg, long index) {
        return (int)constants$257.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void source_id$set(MemorySegment seg, long index, int x) {
        constants$257.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle poll_fds$VH() {
        return constants$257.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GSList* poll_fds;
     * }
     */
    public static MemorySegment poll_fds$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$257.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GSList* poll_fds;
     * }
     */
    public static void poll_fds$set(MemorySegment seg, MemorySegment x) {
        constants$257.const$5.set(seg, x);
    }
    public static MemorySegment poll_fds$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$257.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void poll_fds$set(MemorySegment seg, long index, MemorySegment x) {
        constants$257.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle prev$VH() {
        return constants$258.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GSource* prev;
     * }
     */
    public static MemorySegment prev$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$258.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GSource* prev;
     * }
     */
    public static void prev$set(MemorySegment seg, MemorySegment x) {
        constants$258.const$0.set(seg, x);
    }
    public static MemorySegment prev$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$258.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void prev$set(MemorySegment seg, long index, MemorySegment x) {
        constants$258.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle next$VH() {
        return constants$258.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GSource* next;
     * }
     */
    public static MemorySegment next$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$258.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GSource* next;
     * }
     */
    public static void next$set(MemorySegment seg, MemorySegment x) {
        constants$258.const$1.set(seg, x);
    }
    public static MemorySegment next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$258.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void next$set(MemorySegment seg, long index, MemorySegment x) {
        constants$258.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle name$VH() {
        return constants$258.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* name;
     * }
     */
    public static MemorySegment name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$258.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* name;
     * }
     */
    public static void name$set(MemorySegment seg, MemorySegment x) {
        constants$258.const$2.set(seg, x);
    }
    public static MemorySegment name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$258.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void name$set(MemorySegment seg, long index, MemorySegment x) {
        constants$258.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle priv$VH() {
        return constants$258.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GSourcePrivate* priv;
     * }
     */
    public static MemorySegment priv$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$258.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GSourcePrivate* priv;
     * }
     */
    public static void priv$set(MemorySegment seg, MemorySegment x) {
        constants$258.const$3.set(seg, x);
    }
    public static MemorySegment priv$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$258.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void priv$set(MemorySegment seg, long index, MemorySegment x) {
        constants$258.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

