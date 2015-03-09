package challenge1;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class WordCountMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
  public static IntWritable one = new IntWritable(1);  
  
  public void setup(Context context){
	  //To-Do: Implement a setup method for the map method
	  //       This setup method runs once per map task
  }
  
  @Override
  public void map(LongWritable key, Text value, Context context)
      throws IOException, InterruptedException {
	  //To-Do: Implement a map method
    
  }
}
