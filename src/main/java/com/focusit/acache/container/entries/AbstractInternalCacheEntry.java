package com.focusit.acache.container.entries;

import com.focusit.acache.container.DataContainer;
import com.focusit.acache.metadata.Metadata;

/**
 * An abstract internal cache entry that is typically stored in the data
 * container
 *
 * @author Manik Surtani
 * @since 4.0
 */
public abstract class AbstractInternalCacheEntry<K, V> implements InternalCacheEntry<K, V> {

	protected K key;

	protected AbstractInternalCacheEntry() {
	}

	protected AbstractInternalCacheEntry(K key) {
		this.key = key;
	}

	@Override
	public final void commit(DataContainer<K, V> container, Metadata metadata) {
		// no-op
	}

	@Override
	public final void rollback() {
		// no-op
	}

	@Override
	public void setChanged(boolean changed) {
		// no-op
	}

	@Override
	public final void setCreated(boolean created) {
		// no-op
	}

	@Override
	public final void setRemoved(boolean removed) {
		// no-op
	}

	@Override
	public final void setEvicted(boolean evicted) {
		// no-op
	}

	@Override
	public final void setValid(boolean valid) {
		// no-op
	}

	@Override
	public void setLoaded(boolean loaded) {
		// no-op
	}

	@Override
	public void setSkipLookup(boolean skipLookup) {
		// no-op
	}

	@Override
	public final boolean isNull() {
		return false;
	}

	@Override
	public final boolean isChanged() {
		return false;
	}

	@Override
	public final boolean isCreated() {
		return false;
	}

	@Override
	public final boolean isRemoved() {
		return false;
	}

	@Override
	public final boolean isEvicted() {
		return true;
	}

	@Override
	public final boolean isValid() {
		return false;
	}

	@Override
	public boolean isLoaded() {
		return false;
	}

	@Override
	public boolean skipLookup() {
		return false;
	}

	@Override
	public boolean undelete(boolean doUndelete) {
		return false;
	}

	@Override
	public Metadata getMetadata() {
		return null;
	}

	@Override
	public void setMetadata(Metadata metadata) {
		// no-op
	}

	@Override
	public final K getKey() {
		return key;
	}

	@Override
	public boolean isL1Entry() {
		return false;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "{" + "key=" + key + '}';
	}

	@SuppressWarnings("unchecked")
	@Override
	public AbstractInternalCacheEntry<K, V> clone() {
		try {
			return (AbstractInternalCacheEntry<K, V>) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException("Should never happen!", e);
		}
	}
}
