color ([0.1, 0.1, 0.1, ]) {
  translate ([0, 0, 3]) {
    difference () {
      union () {
        difference () {
          hull () {
            cylinder (h=1, r=39, center=true);
            translate ([0, 0, 13]) {
              cylinder (h=1, r=30, center=true);
            }
          }
          color ([0, 0, 1, 0.6]) {
            translate ([0, 0, -1]) {
              scale ([0.95, 0.95, 0.95]) {
                hull () {
                  cylinder (h=1, r=39, center=true);
                  translate ([0, 0, 13]) {
                    cylinder (h=1, r=30, center=true);
                  }
                }
              }
            }
          }
        }
        translate ([0, 0, -2]) {
          difference () {
            cylinder (h=3, r=39, center=true);
            cylinder ($fn=64, h=4, r=29.5, center=true);
            rotate (a=0.0, v=[0, 0, 1]) {
              translate ([0, 33, 0]) {
                cylinder ($fn=16, h=4, r=1.5, center=true);
              }
            }
            rotate (a=59.99999999999999, v=[0, 0, 1]) {
              translate ([0, 33, 0]) {
                cylinder ($fn=16, h=4, r=1.5, center=true);
              }
            }
            rotate (a=119.99999999999999, v=[0, 0, 1]) {
              translate ([0, 33, 0]) {
                cylinder ($fn=16, h=4, r=1.5, center=true);
              }
            }
            rotate (a=180.0, v=[0, 0, 1]) {
              translate ([0, 33, 0]) {
                cylinder ($fn=16, h=4, r=1.5, center=true);
              }
            }
            rotate (a=239.99999999999997, v=[0, 0, 1]) {
              translate ([0, 33, 0]) {
                cylinder ($fn=16, h=4, r=1.5, center=true);
              }
            }
            rotate (a=299.99999999999994, v=[0, 0, 1]) {
              translate ([0, 33, 0]) {
                cylinder ($fn=16, h=4, r=1.5, center=true);
              }
            }
          }
        }
      }
      translate ([50, 0, 0]) {
        cube ([100, 100, 100], center=true);
      }
    }
  }
}
color ([0.3, 0.2, 0.09, ]) {
  translate ([0, 0, -2.99]) {
    difference () {
      cylinder ($fn=64, h=5, r=39, center=true);
      cylinder ($fn=64, h=7, r=30, center=true);
    }
  }
}
color ([0.1, 0.1, 0.1, ]) {
  rotate ([0.0,0.0,0.0]) {
    difference () {
      union () {
        difference () {
          union () {
            difference () {
              cylinder ($fn=256, h=13, r=29, center=true);
              cylinder ($fn=256, h=15, r=26, center=true);
            }
            translate ([0, 0, -5/2]) {
              difference () {
                cylinder ($fn=256, h=2, r=27, center=true);
                cylinder ($fn=256, h=4, r=24, center=true);
              }
            }
          }
          color ([1, 0, 0, ]) {
            translate ([26, 0, 6]) {
              cube ([10, 20, 10], center=true);
            }
          }
        }
        translate ([0, 0, -6]) {
          difference () {
            cylinder ($fn=256, h=1, r=39.0, center=true);
            union () {
              rotate (a=0.0, v=[0, 0, 1]) {
                translate ([0, 13/2, 0]) {
                  cylinder ($fn=256, h=10, r=2, center=true);
                }
              }
              rotate (a=59.99999999999999, v=[0, 0, 1]) {
                translate ([0, 13/2, 0]) {
                  cylinder ($fn=256, h=10, r=2, center=true);
                }
              }
              rotate (a=119.99999999999999, v=[0, 0, 1]) {
                translate ([0, 13/2, 0]) {
                  cylinder ($fn=256, h=10, r=2, center=true);
                }
              }
              rotate (a=180.0, v=[0, 0, 1]) {
                translate ([0, 13/2, 0]) {
                  cylinder ($fn=256, h=10, r=2, center=true);
                }
              }
              rotate (a=239.99999999999997, v=[0, 0, 1]) {
                translate ([0, 13/2, 0]) {
                  cylinder ($fn=256, h=10, r=2, center=true);
                }
              }
              rotate (a=299.99999999999994, v=[0, 0, 1]) {
                translate ([0, 13/2, 0]) {
                  cylinder ($fn=256, h=10, r=2, center=true);
                }
              }
              rotate ([0.0,0.0,90.0]) {
                rotate (a=0.0, v=[0, 0, 1]) {
                  translate ([0, 13, 0]) {
                    cylinder ($fn=256, h=10, r=2, center=true);
                  }
                }
                rotate (a=59.99999999999999, v=[0, 0, 1]) {
                  translate ([0, 13, 0]) {
                    cylinder ($fn=256, h=10, r=2, center=true);
                  }
                }
                rotate (a=119.99999999999999, v=[0, 0, 1]) {
                  translate ([0, 13, 0]) {
                    cylinder ($fn=256, h=10, r=2, center=true);
                  }
                }
                rotate (a=180.0, v=[0, 0, 1]) {
                  translate ([0, 13, 0]) {
                    cylinder ($fn=256, h=10, r=2, center=true);
                  }
                }
                rotate (a=239.99999999999997, v=[0, 0, 1]) {
                  translate ([0, 13, 0]) {
                    cylinder ($fn=256, h=10, r=2, center=true);
                  }
                }
                rotate (a=299.99999999999994, v=[0, 0, 1]) {
                  translate ([0, 13, 0]) {
                    cylinder ($fn=256, h=10, r=2, center=true);
                  }
                }
              }
              rotate (a=0.0, v=[0, 0, 1]) {
                translate ([0, 13, 0]) {
                  cylinder ($fn=256, h=10, r=1.5, center=true);
                }
              }
              rotate (a=59.99999999999999, v=[0, 0, 1]) {
                translate ([0, 13, 0]) {
                  cylinder ($fn=256, h=10, r=1.5, center=true);
                }
              }
              rotate (a=119.99999999999999, v=[0, 0, 1]) {
                translate ([0, 13, 0]) {
                  cylinder ($fn=256, h=10, r=1.5, center=true);
                }
              }
              rotate (a=180.0, v=[0, 0, 1]) {
                translate ([0, 13, 0]) {
                  cylinder ($fn=256, h=10, r=1.5, center=true);
                }
              }
              rotate (a=239.99999999999997, v=[0, 0, 1]) {
                translate ([0, 13, 0]) {
                  cylinder ($fn=256, h=10, r=1.5, center=true);
                }
              }
              rotate (a=299.99999999999994, v=[0, 0, 1]) {
                translate ([0, 13, 0]) {
                  cylinder ($fn=256, h=10, r=1.5, center=true);
                }
              }
            }
            rotate (a=0.0, v=[0, 0, 1]) {
              translate ([0, 34.125, 0]) {
                cylinder ($fn=256, h=5, r=1.5, center=true);
              }
            }
            rotate (a=59.99999999999999, v=[0, 0, 1]) {
              translate ([0, 34.125, 0]) {
                cylinder ($fn=256, h=5, r=1.5, center=true);
              }
            }
            rotate (a=119.99999999999999, v=[0, 0, 1]) {
              translate ([0, 34.125, 0]) {
                cylinder ($fn=256, h=5, r=1.5, center=true);
              }
            }
            rotate (a=180.0, v=[0, 0, 1]) {
              translate ([0, 34.125, 0]) {
                cylinder ($fn=256, h=5, r=1.5, center=true);
              }
            }
            rotate (a=239.99999999999997, v=[0, 0, 1]) {
              translate ([0, 34.125, 0]) {
                cylinder ($fn=256, h=5, r=1.5, center=true);
              }
            }
            rotate (a=299.99999999999994, v=[0, 0, 1]) {
              translate ([0, 34.125, 0]) {
                cylinder ($fn=256, h=5, r=1.5, center=true);
              }
            }
          }
        }
      }
      rotate ([0.0,0.0,18.0]) {
        rotate (a=0.0, v=[0, 0, 1]) {
          translate ([0, 26, 0]) {
            color ([0, 0, 1, ]) {
              translate ([0, 2.5, 5]) {
                cube ([5, 8, 5], center=true);
              }
            }
          }
        }
        rotate (a=72.0, v=[0, 0, 1]) {
          translate ([0, 26, 0]) {
            color ([0, 0, 1, ]) {
              translate ([0, 2.5, 5]) {
                cube ([5, 8, 5], center=true);
              }
            }
          }
        }
        rotate (a=144.0, v=[0, 0, 1]) {
          translate ([0, 26, 0]) {
            color ([0, 0, 1, ]) {
              translate ([0, 2.5, 5]) {
                cube ([5, 8, 5], center=true);
              }
            }
          }
        }
        rotate (a=216.0, v=[0, 0, 1]) {
          translate ([0, 26, 0]) {
            color ([0, 0, 1, ]) {
              translate ([0, 2.5, 5]) {
                cube ([5, 8, 5], center=true);
              }
            }
          }
        }
        rotate (a=288.0, v=[0, 0, 1]) {
          translate ([0, 26, 0]) {
            color ([0, 0, 1, ]) {
              translate ([0, 2.5, 5]) {
                cube ([5, 8, 5], center=true);
              }
            }
          }
        }
      }
    }
  }
}
color ([1, 0, 0, ]) {
  rotate (a=0.0, v=[0, 0, 1]) {
    translate ([0, 33, 0]) {
      cylinder ($fn=32, h=40, r=1.5, center=true);
    }
  }
  rotate (a=59.99999999999999, v=[0, 0, 1]) {
    translate ([0, 33, 0]) {
      cylinder ($fn=32, h=40, r=1.5, center=true);
    }
  }
  rotate (a=119.99999999999999, v=[0, 0, 1]) {
    translate ([0, 33, 0]) {
      cylinder ($fn=32, h=40, r=1.5, center=true);
    }
  }
  rotate (a=180.0, v=[0, 0, 1]) {
    translate ([0, 33, 0]) {
      cylinder ($fn=32, h=40, r=1.5, center=true);
    }
  }
  rotate (a=239.99999999999997, v=[0, 0, 1]) {
    translate ([0, 33, 0]) {
      cylinder ($fn=32, h=40, r=1.5, center=true);
    }
  }
  rotate (a=299.99999999999994, v=[0, 0, 1]) {
    translate ([0, 33, 0]) {
      cylinder ($fn=32, h=40, r=1.5, center=true);
    }
  }
}
