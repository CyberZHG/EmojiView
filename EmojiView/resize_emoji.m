path = './res/drawable-nodpi/';
files = dir(path);
for i = 1 : length(files)
    name = files(i).name;
    if length(name) < 6
        continue
    end
    if strcmp(name(1:6), 'emoji_') ~= 1
        continue
    end
    [image, map, alpha] = imread([path, name]);
    if isempty(alpha)
        disp(name)
        continue
    end
    image = imresize(image, [32, 32], 'bicubic');
    alpha = imresize(alpha, [32, 32], 'bicubic');
    imwrite(image, [path, name], 'Alpha', alpha);
end