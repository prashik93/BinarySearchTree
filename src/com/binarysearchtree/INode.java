package com.binarysearchtree;

public interface INode<K> {
    K getKey();
    void setKey(K ket);

    INode<K> getNext();
    void setNext(INode<K> next);
}
