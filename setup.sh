#!/bin/bash 
cd opt 
curl https://nodejs.org/dist/v12.18.4/node-v12.18.4-linux-x64.tar.xz  --output node.tar.xz
zcat node.tar.xz | tar -xvf - 
export PATH="/opt/node-v12.18.4-linux-x64/bin:/opt/node-v12.18.4-linux-x64/lib/node_modules:$PATH" 
