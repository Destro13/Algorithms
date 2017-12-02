import java.util.ArrayList;

public class Tournament <T extends Comparable<T>> {
    T[] array;
    int[] matches;
    int tourney;

    Tournament( T[] array )
    {
        this.array = array;
        this.matches = new int[6*array.length];
        this.tourney = knockout( 0, array.length-1, 3 );
    }

    public  void sort()
    {
        ArrayList<T> copy = new ArrayList<T>( array.length );
        for (int i = 0; i < array.length; i++)
            copy.add((T) pop());
        copy.toArray( array );
    }

    public  T[] getArray(){
        return array;
    }

    public	void printArray(){
        for(T i : array){
            System.out.print( i + "\t");
        }
    }

    private T pop()
    {
        T result = array[getPlayer( tourney )];
        tourney = isPlayer( tourney ) ? 0 : rebuild( tourney );
        return result;
    }

    private int getPlayer( int i )
    {
        return i <= 0 ? Math.abs(i) : getWinner( i );
    }

    private void setWinner( int root, int winner ) { matches[root] = winner; }
    private void setWinners( int root, int winners ) { matches[root+1] = winners; }
    private void setLosers( int root, int losers ) { matches[root+2] = losers; }
    private int getWinner( int root )  { return matches[root];   }
    private int getWinners( int root ) { return matches[root+1]; }
    private int getLosers( int root )  { return matches[root+2]; }
    private void setMatch( int root, int winner, int winners, int losers )
    {
        matches[root]   = winner;
        matches[root+1] = winners;
        matches[root+2] = losers;
    }

    private int mkMatch( int top, int bot, int root )
    {
        int top_w = getPlayer( top );
        int bot_w = getPlayer( bot );
        if (array[top_w].compareTo(array[bot_w]) <= 0)
            setMatch( root, top_w, top, bot );
        else
            setMatch( root, bot_w, bot, top );
        return root;
    }

    private int mkPlayer( int i ){ return -i; }

    private int knockout( int i, int k, int root )
    {
        if (i == k) return mkPlayer( i );
        int j = (i+k)/2;
        return mkMatch( knockout( i, j, 2*root ), knockout( j+1, k, 2*root+3 ), root );
    }

    private boolean isPlayer( int i ) { return i <= 0; }

    private int rebuild( int root )
    {
        if (isPlayer( getWinners( root ) ))
            return getLosers( root );
        else
        {
            setWinners( root, rebuild( getWinners( root ) ) );
            if (array[getPlayer(getLosers( root ))].compareTo(array[getPlayer(getWinners( root ))]) < 0)
            {
                setWinner( root, getPlayer( getLosers( root ) ) );
                int temp = getLosers( root );
                setLosers( root, getWinners( root ) );
                setWinners( root, temp );
            }
            else
                setWinner( root, getPlayer( getWinners( root ) ) );
            return root;
        }
    }
}
