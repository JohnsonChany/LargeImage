package com.shizhefei.view.largeimage.model;

import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by JC on 2016/6/21.
 */
public class Position {
    public int row;
    public int col;

    public Position() {
        super();
    }

    public Position(int row, int col) {
        super();
        this.row = row;
        this.col = col;
    }

    public Position set(int row, int col) {
        this.row = row;
        this.col = col;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Position) {
            Position position = (Position) o;
            return row == position.row && col == position.col;
        }
        return false;
    }

    @Override
    public int hashCode() {
        HashCodeBuilder builder = new HashCodeBuilder().append(col).append(row);
        return builder.toHashCode();
    }

    @Override
    public String toString() {
        return "row:" + row + " col:" + col;
    }
}
