(function classify() {
  let info = [""];
  const counts = {};
  const structuredData = [{}];
  info = dataSource.map((item, index) => {
    return item.stage;
  });
  info.forEach(function (x) {
    counts[x] = (counts[x] || 0) + 1;
  });
  for (var key in counts) {
    if (counts.hasOwnProperty(key)) {
      structuredData.push({ arg: key, val: counts[key] });
    }
  }
});
