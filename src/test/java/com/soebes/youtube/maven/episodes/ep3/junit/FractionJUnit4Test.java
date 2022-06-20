package com.soebes.youtube.maven.episodes.ep3.junit;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import static org.assertj.core.api.Assertions.assertThat;

import com.soebes.youtube.maven.episodes.ep3.Fraction;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FractionJUnit4Test {

  @BeforeClass
  public static void beforeClass() {
    System.out.println("FractionJUnit4Test.beforeClass");
  }

  @Before
  public void before() {
    System.out.println("FractionJUnit4Test.before");
  }

  @After
  public void after() {
    System.out.println("FractionJUnit4Test.after");
  }

  @AfterClass
  public static void afterClass() {
    System.out.println("FractionJUnit4Test.afterClass");
  }

  @Test
  public void first_add() {
    System.out.println("FractionJUnit4Test.first_add");
    Fraction sum1 = new Fraction(5);
    Fraction sum2 = new Fraction(2);

    assertThat(sum1.add(sum2)).isEqualTo(new Fraction(7));
  }

}
