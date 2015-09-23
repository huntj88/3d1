package models;

/**
 * Created by James on 9/22/2015.
 */
public class RawModel {

    private int vaoID;
    private int vertexCount;

    public RawModel(int vaoID,int vertexCount)
    {
        this.vaoID=vaoID;
        this.vertexCount=vertexCount;
    }

    public int getVaoID() {
        return vaoID;
    }

    public int getVertexCount() {
        return vertexCount;
    }
}
