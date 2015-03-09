package solution1;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class WordCountMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
  public static IntWritable one = new IntWritable(1); 
  private boolean caseSensitive; 
  
  public void setup(Context context){
	  Configuration conf = context.getConfiguration();
	  caseSensitive = conf.getBoolean("mapper.input.iscasesensative", true);
  }
  
  @Override
  public void map(LongWritable key, Text value, Context context)
      throws IOException, InterruptedException {

    String line = value.toString();

    for (String word : line.split("\\W+")) {
      if (word.length() > 0) {
    	if(caseSensitive) word = word.toLowerCase(); 
        context.write(new Text(word), one);
      }
    }
  }
}
