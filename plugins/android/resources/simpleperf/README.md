The Android simpleperf binaries should be placed in this directory under a specific subfolder according to their architecture:
* **ARM**: armeabi-v7a/simpleperf (SHA1 _dce5e87832c1e94a4048a0e273a03e812dedc360_)
* **ARM64**: arm64-v8a/simpleperf (SHA1 _d181b501ced66cd59e571c2215200961e2113c59_)
* **x86**: x86/simpleperf (SHA1 _fda8f607c63acba1de761842b879f79b0ab96e25_)
* **x86\_64**: x86\_64/simpleperf (SHA1 _884a063bf42ad3a911d33cd2779e54a21927588f_)

There are two ways of obtaining the binaries:

1) Download the binaries directly from [simpleperf prebuilts source](https://android.googlesource.com/platform/prebuilts/simpleperf/+/master/bin/android/). In this case, please edit the paragraph on the bottom of this file mentioning the source tree where the files were obtained from and the AOSP commit that added them.

2) [Download and build](https://source.android.com/source/initializing) the latest (or a specific) version of AOSP, then copy the simpleperf binaries generated as artifacts to this directory. Also, update the text on the bottom of this file mentioning the AOSP source tree built.

Current binaries were downloaded from AOSP simpleperf prebuilts (tree @ [16239029f0337798f63522cae9d9d2b833eef629](https://android.googlesource.com/platform/prebuilts/simpleperf/+/311a9d2cd27841498fc90a0b26a755deb47e7ebd/bin/android/)).

