package com.zou.mapreduce.wordcount;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;


/**
 * KEYIN, map阶段输入的key的类型：LongWritable
 * VALUEIN, map阶段输入value类型：Text
 * KEYOUT, map阶段输出的key类型：Text
 * VALUEOUT, map阶段输入的value类型：IntWritable
 */
public class WordCountMapper extends Mapper <LongWritable,Text,Text, IntWritable>{

}
