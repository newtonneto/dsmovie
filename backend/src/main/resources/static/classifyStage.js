function classifyStage(data, setData, setLoading, series) {
  let info = [""];
  const counts = {};
  const structuredData = [{}];
  info = data.map((item, index) => {
    return item.stage;
  });
  info.forEach(function (x) {
    counts[x] = (counts[x] || 0) + 1;
  });
  for (var key in counts) {
    if (counts.hasOwnProperty(key)) {
      structuredData.push({ [series.argumentField]: key, [series.valueField]: counts[key] });
    }
  }
  setData(structuredData);
  setLoading(false);
};
