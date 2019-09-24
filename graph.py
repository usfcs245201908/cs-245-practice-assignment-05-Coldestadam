#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Fri Sep 13 15:08:39 2019

@author: adam
"""

import numpy as np
import matplotlib.pyplot as plt

x = np.array([50000, 100000, 150000, 200000, 250000, 300000, 350000, 400000,
              450000, 500000])

insertion = np.array([221, 884, 2016, 3576, 6327, 8631, 11008, 13834,
                      18459, 23162])
merge = np.array([13, 14, 17, 28, 34, 32, 34, 38, 42, 47])

quicksort = np.array([42, 21, 45, 77, 111, 157, 211, 271, 354, 421])

plt.plot(x, insertion, label='insertion')
plt.plot(x, merge, label='merge')
plt.plot(x, quicksort, label='quicksort')
plt.axis([0, 500000, 0, 30000])
plt.xlabel('Size of the Array')
plt.ylabel('Time(ms)')
plt.legend()
plt.savefig("graph.pdf", format='pdf')
plt.show()
