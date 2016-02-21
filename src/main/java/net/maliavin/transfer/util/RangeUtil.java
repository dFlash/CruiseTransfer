package net.maliavin.transfer.util;

import java.util.ArrayList;
import java.util.List;

public class RangeUtil
{
    public static List<Range> calculateRanges(int gridSize, List<Long> ids)
    {
        List<Range> ranges = new ArrayList<Range>();

        int chunkSize = (int) Math.ceil(ids.size() / (double) gridSize);
        int chunkIndex = 0;
        long start = 0;
        long end = 0;
        for (int i = 0; i < ids.size(); i++)
        {
            if (chunkIndex == 0)
            {
                start = ids.get(i);
            }
            chunkIndex++;
            if (chunkIndex == chunkSize)
            {
                chunkIndex = 0;
                end = ids.get(i);
                ranges.add(new Range(start, end));
            }
        }

        return ranges;
    }

    public static class Range
    {
        private long startIndex;

        private long endIndex;

        public Range(long startIndex, long endIndex)
        {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        public long getStartIndex()
        {
            return startIndex;
        }

        public long getEndIndex()
        {
            return endIndex;
        }
    }
}
