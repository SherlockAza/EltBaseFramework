package com.elt.framework.library.adapter;

/**
 * 作者：addison on 15/12/15 11:14
 * 邮箱：gengxin@elongtian.com
 */
public interface ViewHolderCreator<ItemDataType> {
    public ViewHolderBase<ItemDataType> createViewHolder(int position);
}
