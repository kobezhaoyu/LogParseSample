import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class MyMapper extends Mapper<LongWritable, Text,LongWritable,Text> {

    LogParser logParser= new LogParser();
    Text text= new Text();

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {



        context.write(key, text);

    }
}
